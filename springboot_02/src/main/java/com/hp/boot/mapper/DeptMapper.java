package com.hp.boot.mapper;


import com.hp.boot.pojo.DeptInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("deptMapper")
public interface DeptMapper {

    List<DeptInfo> findAll();

}
