package br.edu.conversor.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

import br.edu.conversor.dao.VocabuloDAO;
import br.edu.conversor.entity.Vocabulo;

@ManagedBean
public class VocabuloController {

	private List<Vocabulo> vocabulos;
	private VocabuloDAO vocabulodao;
	
	public VocabuloController()
	{
		vocabulos = vocabulodao.Listar();
		
	}
	
	
}
