package com.objectFrontier.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.objectFrontier.form.HelloWorldSample;

public class HelloWorldAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
								 HttpServletRequest request, HttpServletResponse response) 
								 throws Exception {
		
		HelloWorldSample hwForm = (HelloWorldSample) form;
		hwForm.setMessage("Hello World Example");
		return mapping.findForward("success");
	}
}



