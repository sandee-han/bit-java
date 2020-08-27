package com.java.network.echoserver.v2;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;


//	v2. multi Thread version Echo Server
public class Server {
	
	public static void main(String[] args) {
		//	1. 서버 소켓 생성
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			//	2. bind (주소 - 포트 연결)
			InetSocketAddress local = new InetSocketAddress("127.0.0.1", // localhost
															10000);		//	PORT
			serverSocket.bind(local);	//	bind
			
			System.out.println("<서버 시작>");
			System.out.println("[연결을 기다립니다.]");
			
			//	3. 접속 대기 : 여러 클라이언트의 접속을 허용
			while(true) {
				Socket socket = serverSocket.accept();
				//	새 서버 Thread를 만들어서 로직을 수행
				Thread thread = new ServerThread(socket);
				thread.start();
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			//	서버 소켓 닫기
			try {
			serverSocket.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}







