package com.form.form.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.form.form.Model.Form;

@Repository
public interface FormRepo extends JpaRepository<Form,Integer> {

}
