package com.test.java.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Scanner;

public class NIOClientTest1 {
	
	private Selector selector;
	
	
	public void init(int port) throws IOException {
		//构建客户端的通道
		SocketChannel channel = SocketChannel.open();
		//将通道设置为非阻塞
		channel.configureBlocking(false);
		//创建一个selector管理器
		this.selector = Selector.open();
		//客户端连接服务器的配置
		channel.connect(new InetSocketAddress("localhost", 8000));
		channel.register(selector, SelectionKey.OP_CONNECT);
	}
	
	public void listen() throws IOException{
		System.out.println("客户端启动");
		Scanner scan = new Scanner(System.in);
		while(true) {
			selector.select();
			Iterator<SelectionKey> it = selector.selectedKeys().iterator();
			while(it.hasNext()) {
				SelectionKey key = it.next();
					
				if(key.isReadable()) {
					SocketChannel channel = (SocketChannel) key.channel();
					ByteBuffer buffer = ByteBuffer.allocate(48);
					channel.read(buffer);
					System.out.println("服务器返回的数据为："+new String(buffer.array()));
					
				}else if(key.isConnectable()) {
					SocketChannel channel = (SocketChannel)key.channel();
					//如果已经连接了，就关闭。
					if(channel.isConnectionPending()) {
						channel.finishConnect();
					}
					channel.configureBlocking(false);
					
					while(true) {
						String read = scan.nextLine();
						channel.write(ByteBuffer.wrap(new String(read).getBytes()));
						channel.register(selector, SelectionKey.OP_READ);
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		NIOClientTest1 client = new NIOClientTest1();
		try {
			client.init(8000);
			client.listen();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
