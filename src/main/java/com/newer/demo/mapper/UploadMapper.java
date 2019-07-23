package com.newer.demo.mapper;

import com.newer.demo.domain.Upload;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UploadMapper {

    @Select("select * from upload")
    public List<Upload> selAll();

}
