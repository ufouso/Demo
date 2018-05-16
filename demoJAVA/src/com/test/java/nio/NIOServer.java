package com.test.java.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * nio服务端
 * @author xpp
 *
 */
public class NIOServer {
	
	private Selector selector;
	
	/**
	 * 获取一个serverSocket通道，并对通道初始化。
	 * @param port
	 * @throws IOException
	 */
	public void initServer(int port) throws IOException {
		//建立一个通道
		ServerSocketChannel channel = ServerSocketChannel.open();
		//将通道设置为非阻塞的
		channel.configureBlocking(false);
		//将通道对应的serverSocket绑定到port端口
		channel.socket().bind(new InetSocketAddress(port));
		//获取一个通道管理器
		this.selector = Selector.open();
		//将通道管理器和该通道绑定，并通知通道注册SelectionKey.OP_ACCEPT事件
		//当事件到达了SelectionKey.OP_ACCEPT时，selector.select()就会返回，
		//如果没有到达那么就会一直阻塞。
		channel.register(selector, SelectionKey.OP_ACCEPT);
	}
	
	public void listen() throws IOException {
		System.out.println("服务端启动成功！");
		while(true) {
			//当注册事件到达时，方法返回，否则该方法会一直阻塞。
			selector.select();
			
			Iterator<SelectionKey> it = this.selector.selectedKeys().iterator();
			
			while(it.hasNext()) {
				SelectionKey key = (SelectionKey) it.next();
				it.remove();
				if(key.isAcceptable()) {
					//获取该事件的socket通道
					ServerSocketChannel server = (ServerSocketChannel) key.channel();
					//并且接受连接
					SocketChannel channel = server.accept();
					//将通道设置为非阻塞的。
					channel.configureBlocking(false);
//					channel.register(this.selector, SelectionKey.OP_WRITE|SelectionKey.OP_READ);
					
					//将缓冲区的数据写入到通道中。
					ByteBuffer by = ByteBuffer.wrap(new String("向客户端发送了一条信息。").getBytes());
					channel.write(by);
					channel.register(this.selector, SelectionKey.OP_READ);
				} else  if(key.isReadable()){
					//获取该事件的socket通道
					SocketChannel channel = (SocketChannel) key.channel();
					//创建读取的缓冲区，并且定义了缓冲区的容量
					ByteBuffer by = ByteBuffer.allocate(48);
					//从通道中将数据读取到缓冲区。
					channel.read(by);
					String msg = new String(by.array());
					System.out.println("客户端发送过来的数据为："+msg);
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		NIOServer server = new NIOServer();
		try {
			server.initServer(8200);
			server.listen();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
