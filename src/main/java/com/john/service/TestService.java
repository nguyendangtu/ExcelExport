package com.john.service;

import com.john.model.Test;
import com.john.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService{
    @Autowired
    private TestRepository testRepository;
    public List<Test> findAllTests() {
        return testRepository.findAll();
    }
}
