package br.edu.conversor.dao;

import java.util.List;

import br.edu.conversor.entity.Vocabulo;

public class ConverterBlocos {
	
	static VocabuloDAO dao = new VocabuloDAO();
	static List<Vocabulo> vocabulos = dao.Listar();

	public static StringBuffer ConverterBloco(StringBuffer bloco)
	{
		for(Vocabulo vocabulo : vocabulos )
		while(bloco.indexOf(vocabulo.getVocabuloAntigo())!=-1)
			bloco.replace(bloco.indexOf(vocabulo.getVocabuloAntigo()), bloco.indexOf(vocabulo.getVocabuloAntigo()) + vocabulo.getVocabuloAntigo().length(), vocabulo.getVocabuloNovo());		
		return bloco;
	}
	
	
}
