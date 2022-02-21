package com.student.page.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.student.page.model.Student;
import com.student.page.repository.Studentrepository;
import com.student.page.service.Studentservice;
@Service
public class Studentserviceimpl implements Studentservice{

	private Studentrepository repo;
	public Studentserviceimpl(Studentrepository repo) {
		super();
		this.repo = repo;
	}
	@Override
	public List<Student> getAlldetails() {
		
		return repo.findAll();
	}

}
