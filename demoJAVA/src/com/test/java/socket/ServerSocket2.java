package com.test.java.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerSocket2 {
	
	private  ServerSocket serverSocket;
	
	private List<PrintWriter> list = new ArrayList<PrintWriter>();
	
	public ServerSocket2(){
		try {
			serverSocket = new ServerSocket(8000);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void begin(){
		try {
			while(true){
				System.out.println("等待客户端连接。。");
				Socket socket = serverSocket.accept();
				System.out.println("客户端连接成功。");
				
				//启动线程与客户端交互.
				ClientHandler ch = new ClientHandler(socket);
				new Thread(ch).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	 private class ClientHandler implements Runnable{
		 
		 private Socket socket;
		 
		 public ClientHandler(Socket socket){
			 this.socket = socket;
		 }
		 

		@Override
		public void run() {
			PrintWriter pw = null;
			try {
				OutputStream os = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
				pw = new PrintWriter(osw, true);
				list.add(pw);
				
				InputStream is = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(is,"UTF-8");
				BufferedReader br = new BufferedReader(isr);
				
				String message = null;
				
				//如果list中有数据，那么就将数据发送给所有客户端
				while((message = br.readLine())!=null){
					for(PrintWriter pwr : list){
						pwr.println(message);
					}
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {//当客户端断线，需要将输出流从共享集合中删除
				list.remove(pw);
				if(socket !=null){
					 try {
						socket.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			
		}
		 
	 }
	 
	 
	 public static void main(String[] args) {
		 ServerSocket2 ss = new ServerSocket2();
		 ss.begin();
	}
}
