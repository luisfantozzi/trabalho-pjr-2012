package br.edu.conversor.dao;

public class ConverterBlocos {

	public static StringBuffer ConverterBloco(StringBuffer bloco)
	{
		
		while(bloco.indexOf("id�ia")!=-1)
			bloco.replace(bloco.indexOf("id�ia"), bloco.indexOf("id�ia") + "id�ia".length(), "ideia");		
		return bloco;
	}
	
	
}
