package com.hp.boot.pojo;

import java.util.List;

public class DeptInfo {
    private Integer deptId;
    private String deptName;
    private String note;
    private List<EmpInfo> emps;

    public DeptInfo() {
        super();
    }

    public DeptInfo(Integer deptId, String deptName, String note, List<EmpInfo> emps) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.note = note;
        this.emps = emps;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<EmpInfo> getEmps() {
        return emps;
    }

    public void setEmps(List<EmpInfo> emps) {
        this.emps = emps;
    }

    @Override
    public String toString() {
        return "DeptInfo{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", note='" + note + '\'' +
                ", emps=" + emps +
                '}';
    }
}
