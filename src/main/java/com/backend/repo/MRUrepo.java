package com.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.entity.student;

public interface MRUrepo extends JpaRepository<student, Integer> {

}
