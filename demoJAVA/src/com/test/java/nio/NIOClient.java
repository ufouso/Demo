package com.test.java.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

public class NIOClient {
	
	private Selector selector;
	
	public void init(String ip, int port) throws IOException {
		SocketChannel channel = SocketChannel.open();
		//选择器
		this.selector = Selector.open();
		channel.configureBlocking(false);
		//客户端连接服务器的配置
		channel.connect(new InetSocketAddress(ip, port));
		channel.register(selector, SelectionKey.OP_CONNECT );
		
	}
	
	
	public void listen() throws IOException {
		
		while(true) {
			this.selector.select();
			Iterator<SelectionKey> it = this.selector.selectedKeys().iterator();
			while(it.hasNext()) {
				SelectionKey key = it.next();
				it.remove();
				if(key.isConnectable()) {
					SocketChannel channel = (SocketChannel) key.channel();
					//如果正在连接的话，那么就关闭连接
					if(channel.isConnectionPending()) {
						channel.finishConnect();
					}
					channel.configureBlocking(false);
					//将缓冲区中的数据写入到通道中。
					ByteBuffer by = ByteBuffer.wrap(new String("客户端发送信息！").getBytes());
					//给服务端发送信息
					channel.write(by);
					//在与服务端连接成功之后，为了可以接受服务端的信息，需要给通道设置读的权限
					channel.register(selector, SelectionKey.OP_READ);
					
				}else if(key.isReadable()) {
					SocketChannel channel = (SocketChannel) key.channel();
					//创建读取的缓冲区
					ByteBuffer by = ByteBuffer.allocate(48);
					channel.read(by);
					//返回缓冲区的byte数组
					String msg = new String(by.array());
					System.out.println("服务端返回给客户端数据为："+msg);
				}
			}
		}
		
	}
	
	public static void main(String[] args)  {
		NIOClient client = new NIOClient();
		try {
			client.init("localhost", 8200);
			client.listen();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
