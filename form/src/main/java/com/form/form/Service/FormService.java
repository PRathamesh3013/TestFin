package com.form.form.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.form.form.Model.Form;
import com.form.form.Repository.FormRepo;
@Service
public class FormService {
	
	@Autowired
	FormRepo formRepo;
	
	public Form createForm(Form user) {
		return formRepo.save(user);
	}

}
