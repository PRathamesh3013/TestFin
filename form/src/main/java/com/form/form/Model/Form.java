package com.form.form.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Form {
	@Id
	int id;
	 String firstName;
     String middleName;
     String lastName;
     String password;

}
