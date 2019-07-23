package com.newer.demo.service;

import com.newer.demo.mapper.UploadMapper;
import com.newer.demo.domain.Upload;
import com.newer.demo.mapper.UploadMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UploadService {
    @Autowired
    private UploadMapper uploadMapper;

    public List<Upload> selAll(){
        return uploadMapper.selAll();
    }

}
