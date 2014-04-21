package com.example.carrinho;

import java.io.IOException;

public class MovimentoController {
	 
	private TcpClient tcp;
	private Acelerometro acelerometro;
	 
	
	public MovimentoController()
	{
	}
	
	public void start() throws IOException
	{
		tcp = new TcpClient();
		acelerometro = new Acelerometro(this);
	}
	
	public void sendCoordenadasTCP(float[] valores)
	{
		for(int i = 0;i < valores.length; i++ )
		{
			tcp.sendMessage(valores[i]);
		}
	}
}
