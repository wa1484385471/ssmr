package com.hp.boot.mapper;


import com.hp.boot.pojo.EmpInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("empMapper")
public interface EmpMapper {

    List<EmpInfo> findAll();

    int saveEmp(EmpInfo emp);

    EmpInfo getEmpById(int empId);

    int editEmp(EmpInfo emp);

    int delEmpById(int empId);
}
