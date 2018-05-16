package com.test.java.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientSocket2 {
	
	private Socket socket;
	
	/**
	 * 定义客户端请求的服务器ip和端口
	 */
	public ClientSocket2(){
		try {
			socket = new Socket("localhost", 8000);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void begin(){
		//启动线程来监听
		ServerHandler sh = new ServerHandler();
		Thread t = new Thread(sh);
		t.setDaemon(true);
		t.start();
		
		try {
			//将客户端输入的数据发送给服务器端。
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
			PrintWriter pw = new PrintWriter(osw,true);
			Scanner sc = new Scanner(System.in);
			while(true){
				try {
					pw.println("faker");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	/**
	 * 
	 * @Description 客户端读取服务器端发送过来的消息。
	 * @author xpp
	 * @date 2017年9月2日 下午3:21:26
	 */
	private class ServerHandler implements Runnable{
		
		@Override
		public void run() {
			try {
				InputStream  is = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(is,"UTF-8");
				BufferedReader br = new BufferedReader(isr);
				while(true){
					System.out.println(br.readLine());
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		ClientSocket2 c2 = new ClientSocket2();
		c2.begin();
	}
	
}
