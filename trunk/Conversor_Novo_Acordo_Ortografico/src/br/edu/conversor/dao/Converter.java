package br.edu.conversor.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.edu.conversor.entity.Vocabulo;

public class Converter {
	
	private static VocabuloDAO dao = new VocabuloDAO();
	private static List<Vocabulo> vocabulos = dao.Listar();
	private static List<String> palavrasAntigas = AntigasToArray();
	private static List<String> palavrasNovas = NovasToArray();
	
	private static List<String> AntigasToArray()
	{
		List<String> lista = new ArrayList<String>();
		for(Vocabulo vocabulo:vocabulos)
			lista.add(vocabulo.getVocabuloAntigo());
		return lista;
	}
	
	private static List<String> NovasToArray()
	{
		List<String> lista = new ArrayList<String>();
		for(Vocabulo vocabulo:vocabulos)
			lista.add(vocabulo.getVocabuloNovo());
		return lista;
	}
	
	private static String CaseCheck(String velha, String nova)
	{
		if(Character.isUpperCase(velha.charAt(0)))
			return new String( Character.toUpperCase(nova.charAt(0)) + nova.substring(1));
		else
			return nova;
	}
	
	public static String ConverterTexto(String texto)
	{
		
		String palavra ="";
		int indice = -1;
		for(char caracter : texto.toString().toCharArray() )
			if(Character.isLetter(caracter) || caracter =='-')
				palavra += caracter;
			else
			 if(palavra.trim().length()!=0)
			 {
				indice = palavrasAntigas.indexOf(palavra.toLowerCase());
				if (indice>=0)
					texto = texto.replace(palavra, CaseCheck(palavra,palavrasNovas.get(indice)));
				palavra = "";
			 }	
		indice = palavrasAntigas.indexOf(palavra.toLowerCase());
		if (indice>=0)
			texto = texto.replace(palavra,  CaseCheck(palavra,palavrasNovas.get(indice)));
		return texto;
	}
	
	
}
