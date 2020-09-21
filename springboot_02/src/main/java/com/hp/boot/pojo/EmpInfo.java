package com.hp.boot.pojo;

public class EmpInfo {
    private Integer empId;
    private String empName;
    private String sex;
    private Integer age;
    private String phone;
    private DeptInfo dept;

    public EmpInfo() {
        super();
    }

    public EmpInfo(Integer empId, String empName, String sex, Integer age, String phone, DeptInfo dept) {
        this.empId = empId;
        this.empName = empName;
        this.sex = sex;
        this.age = age;
        this.phone = phone;
        this.dept = dept;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public DeptInfo getDept() {
        return dept;
    }

    public void setDept(DeptInfo dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "EmpInfo{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", dept=" + dept +
                '}';
    }
}
