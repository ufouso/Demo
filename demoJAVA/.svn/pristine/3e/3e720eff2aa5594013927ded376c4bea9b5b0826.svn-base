package com.test.java.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketOne {
	
	private ServerSocket serverSocket;
	
	/**
	 * 构造方法初始化
	 */
	public ServerSocketOne(){
		try {
			serverSocket = new ServerSocket(8080);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void start(){
		try{
			System.out.println("等待客户端连接。。。");
			//监听服务器的连接
			Socket socket = serverSocket.accept();
			System.out.println("客户端连接上了！");
			InputStream is = socket.getInputStream();
			InputStreamReader  isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
//			System.out.println("客户端说："+br.readLine());
			while(true){
				System.out.println("客户端说："+br.readLine());
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ServerSocketOne sso = new ServerSocketOne();
		sso.start();
	}
}
