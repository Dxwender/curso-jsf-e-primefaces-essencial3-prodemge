package com.algaworks.erp.util;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.facelets.FaceletContext;

public class FacesMessages implements Serializable {
	
	private static final long serialVersionUID=1L;
	
	private void add (String msg, FacesMessage.Severity severty) {
		FacesMessage facesMessage= new FacesMessage(msg);
		facesMessage.setSeverity(severty);
		
		FacesContext.getCurrentInstance().addMessage(null, facesMessage);
	}
	
	public void info(String msg) {
		add(msg,FacesMessage.SEVERITY_INFO);
	}
	
}
