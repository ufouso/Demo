package com.test.java.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientSocket {
	
	private Socket socket;
	
	/**
	 * 构造方法初始化
	 */
	public ClientSocket(){
		try {
			socket = new Socket("localhost",8080);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	/*
	 * 客户端工作方法
	 */
	public void start(){
		try {
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter ow = new OutputStreamWriter(os,"UTF-8");
			PrintWriter ps = new PrintWriter(ow,true);
//			ps.println("hello!");
			Scanner sc = new Scanner(System.in);
			while(true){
				String f = sc.nextLine();
				ps.println(f);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			if(socket !=null){
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		ClientSocket cs = new ClientSocket();
		cs.start();
	}
}
