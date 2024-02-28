package com.form.form.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.form.form.Model.Form;
import com.form.form.Service.FormService;


@Controller
public class FormController {
	@Autowired
	FormService formServices;
	
	@GetMapping("/welcome")
	public String forms() {
		return "Forms";
	}
	@PostMapping("/save")
    public String submitForm(@RequestBody Form form) {
        return "Forms";
    }

}
