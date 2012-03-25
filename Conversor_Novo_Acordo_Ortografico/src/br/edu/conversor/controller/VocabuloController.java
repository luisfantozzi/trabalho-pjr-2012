package br.edu.conversor.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.edu.conversor.dao.VocabuloDAO;
import br.edu.conversor.entity.Vocabulo;

@ManagedBean
public class VocabuloController {

	private List<Vocabulo> vocabulos;
	private VocabuloDAO vocabulodao = new VocabuloDAO();
	
	public List<Vocabulo> listarvocabulos;
	
	public VocabuloController()
	{
		
		listarvocabulos = vocabulodao.Listar();
		
	}

	public List<Vocabulo> getListarvocabulos() {
		return listarvocabulos;
	}

	public void setListarvocabulos(List<Vocabulo> listarvocabulos) {
		this.listarvocabulos = listarvocabulos;
	}
	
	
}
