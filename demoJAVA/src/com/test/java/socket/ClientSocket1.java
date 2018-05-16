package com.test.java.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientSocket1 {
	
	private Socket s;
	
	public ClientSocket1(){
		try {
			s = new Socket("localhost", 8088);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void begin(){
		try {
			OutputStream os = s.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os, "utf-8");
			PrintWriter pw = new PrintWriter(osw,true);
			Scanner sc = new Scanner(System.in);
			while(true){
				pw.println(sc.nextLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(s !=null){
				try {
					s.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		ClientSocket1 cs1 = new ClientSocket1();
		cs1.begin();
		
		ClientSocket1 cs2 = new ClientSocket1();
		cs2.begin();
	}
	
}
