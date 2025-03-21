package com.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.entity.student;
import com.backend.repo.MRUrepo;

@Service
public class MRUServices {
	@Autowired
	private MRUrepo repo;
	public List<student> getStudent(){
		return repo.findAll();
	}

}
