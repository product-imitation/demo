package com.newer.demo.controller;


import com.newer.demo.service.UploadService;
import com.newer.demo.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @Autowired
    private UploadService service;

    @RequestMapping("selAll")
    public ResponseEntity<?> selAll(){
        return new ResponseEntity<>(service.selAll(),HttpStatus.OK);
    }
}
