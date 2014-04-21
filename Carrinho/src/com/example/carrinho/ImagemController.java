package com.example.carrinho;

public class ImagemController {
	private Imagem imagem;
	private UdpServer udp;
	
	public void start()
	{
		imagem = new Imagem();
		udp = new UdpServer(this);
	}
	
	public void mandaImagemPraTela()
	{
		
	}
	
}
