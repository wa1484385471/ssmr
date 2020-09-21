package com.hp.boot.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hp.boot.mapper.DeptMapper;
import com.hp.boot.mapper.EmpMapper;
import com.hp.boot.pojo.DeptInfo;
import com.hp.boot.pojo.EmpInfo;
import com.hp.boot.service.EmpService;
import com.hp.boot.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("empService")
@Transactional
public class EmpServiceImpl implements EmpService{
    @Autowired
    private EmpMapper empMapper;
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public JsonData allEmp(int page, int limit) {
        PageHelper.startPage(page, limit);
        List<EmpInfo> all = empMapper.findAll();
        PageInfo<EmpInfo> pageInfo = new PageInfo<>(all);
        return JsonData.buildSuc(pageInfo);
    }

    @Override
    public JsonData delEmpById(int empId) {
        int result=empMapper.delEmpById(empId);
        if (result>=0){
            return JsonData.buildSuc("删除"+empId+"成功");
        }
        return JsonData.buildError("删除失败");
    }

    @Override
    public JsonData allDept() {
        List<DeptInfo> all = deptMapper.findAll();
        return JsonData.buildSuc(all);
    }

    @Override
    public JsonData saveEmp(EmpInfo emp) {
        int result = 0;
        if(emp.getEmpId() == null){
            result = empMapper.saveEmp(emp);
        } else {
            result = empMapper.editEmp(emp);
        }
        if (result >= 0){
            return JsonData.buildSuc("编辑成功....");
        }
        return JsonData.buildError("编辑失败....");
    }

    @Override
    public JsonData getEmpById(int empId) {
        EmpInfo info = empMapper.getEmpById(empId);
        return JsonData.buildSuc(info);
    }
}
