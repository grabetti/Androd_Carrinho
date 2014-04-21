package com.example.carrinho;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class TcpClient  {
	public static final String IPSERVER = "";
	public static final int PORT = 1235;
	private Socket socket;
	private PrintWriter out;
	
	public TcpClient() throws IOException
	{
		InetAddress serverAdd = InetAddress.getByName(IPSERVER);
		socket = new Socket(serverAdd,PORT);
		out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
	}
	
	public void sendMessage(Float XYZ)
	{
		if(out != null && !out.checkError())
		{
			out.println(XYZ);
			out.flush();
		}
	}
}
