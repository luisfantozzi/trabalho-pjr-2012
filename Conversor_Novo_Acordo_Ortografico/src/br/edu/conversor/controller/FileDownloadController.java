package br.edu.conversor.controller;  
  
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.faces.bean.ManagedBean;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

@ManagedBean
public class FileDownloadController {  
  
	 private  static File arquivo;
	    
	 
	 public static void setArquivo(File arquivo) {
			FileDownloadController.arquivo = arquivo;
	 }    
	
	private  StreamedContent file; 
	 
    public StreamedContent getFile() throws FileNotFoundException
    {
    	if(arquivo !=null)
    	{
    	InputStream stream = new FileInputStream(arquivo.getAbsolutePath());  
    	return new DefaultStreamedContent(stream,"application/"+arquivo.getName().substring(arquivo.getName().lastIndexOf(".")+1), "[Convertido]"+arquivo.getName().substring(arquivo.getName().indexOf("_") + 1));  
    	}
    	else return null;
    	   
    }
   
    

}  
             