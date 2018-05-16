package com.test.java.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocket1 {
	
	//服务器socket
	private ServerSocket ss;
	
	//构造方法初始化
	public ServerSocket1(){
		try {
			ss = new ServerSocket(8088);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void begin(){
		try {
			System.out.println("服务端启动");
			while(true){
				System.out.println("等待客户端连接。。。");
				Socket socket = ss.accept();
				System.out.println("客户端连接上了！");
				//启动一个线程为与客户端交互。
				ClientThread ct = new ClientThread(socket);
				new Thread(ct).start();
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//处理与客户端交互
	public class ClientThread implements Runnable{
		
		private Socket s;
		
		public ClientThread(Socket s){
			this.s = s;
		}
		
		@Override
		public void run() {
			
			try {
				InputStream is = s.getInputStream();
				InputStreamReader isr = new InputStreamReader(is, "utf-8");
				BufferedReader br = new BufferedReader(isr);
				while(true){
					System.out.println( Thread.currentThread().getName() +"客户说：" + br.readLine());
				}
			
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		ServerSocket1 ss1 = new ServerSocket1();
		ss1.begin();
	}
}
