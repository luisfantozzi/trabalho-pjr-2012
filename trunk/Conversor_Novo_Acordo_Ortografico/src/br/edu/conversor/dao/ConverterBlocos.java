package br.edu.conversor.dao;

public class ConverterBlocos {

	public static StringBuffer ConverterBloco(StringBuffer bloco)
	{
		
		while(bloco.indexOf("idéia")!=-1)
			bloco.replace(bloco.indexOf("idéia"), bloco.indexOf("idéia") + "idéia".length(), "ideia");		
		return bloco;
	}
	
	
}
