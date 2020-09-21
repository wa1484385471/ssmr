package com.hp.boot.controller;

import com.hp.boot.pojo.EmpInfo;
import com.hp.boot.service.EmpService;
import com.hp.boot.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping("/allEmp")
    public JsonData allEmp(int page, int limit){
        JsonData jsonData = empService.allEmp(page,limit);
        return jsonData;
    }

    @RequestMapping("/allDept")
    public JsonData allDept(){
        JsonData jsonData = empService.allDept();
        return jsonData;
    }

    @RequestMapping("/delEmpById")
    public JsonData delEmpById(int empId){
        JsonData jsonData = empService.delEmpById(empId);
        return jsonData;
    }

    @RequestMapping("/saveEmp")
    public JsonData saveEmp(EmpInfo emp){
        JsonData jsonData = empService.saveEmp(emp);
        return jsonData;
    }

    @RequestMapping("/getEmpById")
    public JsonData getEmpById(int empId){
        JsonData jsonData = empService.getEmpById(empId);
        return jsonData;
    }
}
