package br.edu.conversor.controller; 
  
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.event.FileUploadEvent;

import br.edu.conversor.dao.Documento;
  
@ManagedBean
public class FileUploadController    {  
	
    public void handleFileUpload(FileUploadEvent event)  { 
    	try
    	{
	    	Documento arquivo = new Documento(event.getFile());
	    	FacesMessage msg = new FacesMessage("Upload Realizado", event.getFile().getFileName() + " foi enviado.");  
	        FacesContext.getCurrentInstance().addMessage(null, msg);
	        arquivo.Converter();
	        
	    }
    	catch(Exception e)
    	{
    		FacesMessage msg = new FacesMessage("Upload falhou", "Tente reenviar o arquivo.");
    		FacesContext.getCurrentInstance().addMessage(null, msg); 
    	}
        
    }  
}  
             
