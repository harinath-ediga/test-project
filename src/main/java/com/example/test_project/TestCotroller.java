package com.example.test_project;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class TestCotroller {

    @GetMapping("/hello/{name}")
    public ResponseEntity<List<String>> getMessage(@PathVariable("name") @Validated  String name){

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
