package com.hp.boot.service;

import com.hp.boot.pojo.EmpInfo;
import com.hp.boot.utils.JsonData;

public interface EmpService {
    JsonData allEmp(int page, int limit);

    JsonData delEmpById(int empId);

    JsonData allDept();

    JsonData saveEmp(EmpInfo emp);

    JsonData getEmpById(int empId);
}
