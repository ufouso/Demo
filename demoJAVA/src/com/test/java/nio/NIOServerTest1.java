package com.test.java.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Scanner;

public class NIOServerTest1 {
	
	private Selector selector;
	
	/**
	 * 往通道管理器中注册通道感兴趣的事件
	 * @param port
	 * @throws IOException 
	 */
	public void init(int port) throws IOException {
		//建立通道，监听tcp请求。
		ServerSocketChannel socketChannel = ServerSocketChannel.open();
		//将通道设置为非阻塞的
		socketChannel.configureBlocking(false);
		//将通道对应的serverSocket绑定到port的端口上
		socketChannel.socket().bind(new InetSocketAddress(port));
		//开启通道管理器
		this.selector = Selector.open();
		//将感兴趣的事件注册到通道管理器上，同时将通道管理器与通道进行绑定。
		socketChannel.register(selector, SelectionKey.OP_ACCEPT);
	}
	
	public void listen() throws IOException {
		System.out.println("服务器启动");
		Scanner scan = new Scanner(System.in);
		while(true) {
			//通过轮询的方式来访问通道管理器，是否有就绪的事件
			//如果没有继续阻塞，否则就进行下一步
			selector.select();
			//准备就绪的通道
			Iterator<SelectionKey> it = selector.selectedKeys().iterator();
			while(it.hasNext()) {
				//获取通道目前注册的事件
				SelectionKey key = it.next();
				it.remove();
				if(key.isAcceptable()) {
					//获取监听的TCP的ServerSocketChannel
					ServerSocketChannel server = (ServerSocketChannel) key.channel();
					//接收连接
					SocketChannel channel = server.accept();
					//将通道设置为非阻塞
					channel.configureBlocking(false);
					//向客户端发送一条信息
					String msg = "6666";
					//将缓冲区的数据写入到通道中
					channel.write(ByteBuffer.wrap(msg.getBytes()));
					//同时将通道注册读事件。
					channel.register(selector, SelectionKey.OP_READ);
				}else if(key.isReadable()) {
					
					SocketChannel  channel  = (SocketChannel) key.channel();
					//读取客户端发送过来的信息
					//缓冲区分配内存空间
					ByteBuffer buffer = ByteBuffer.allocate(48);
					//从通道中读取数据到缓冲区
					channel.read(buffer);
					//解析出客户端发送的数据
					String msg = new String(buffer.array());
					System.out.println("客户端发送过来的数据为"+msg);
				}
				
			}
			
		}
	}
	
	public static void main(String[] args) {
		NIOServerTest1 server = new NIOServerTest1();
		try {
			server.init(8000);
			server.listen();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
