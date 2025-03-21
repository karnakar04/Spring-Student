package com.backend.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.backend.entity.student;
import com.backend.service.MRUServices;

@RestController
@CrossOrigin("*")
public class MRUcontroller {
    @Autowired
    private MRUServices services;

    @GetMapping("/student")
    public List<student> getAllStudent() {
        return services.getStudent();
    }
}
