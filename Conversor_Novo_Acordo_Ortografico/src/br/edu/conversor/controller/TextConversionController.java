package br.edu.conversor.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;

import br.edu.conversor.dao.Converter;

@ManagedBean
public class TextConversionController {

	private String textoVelho;
	private String textoNovo;
	
	public String getTextoVelho() {
		return textoVelho;
	}
	public void setTextoVelho(String textoVelho) {
		this.textoVelho = textoVelho;
	}
	public String getTextoNovo() {
		return textoNovo;
	}
	public void setTextoNovo(String textoNovo) {
		this.textoNovo = textoNovo;
	}
	
	public void converter(ActionEvent actionEvent)
	{
		textoNovo = Converter.ConverterTexto(textoVelho);
	}
	
}
