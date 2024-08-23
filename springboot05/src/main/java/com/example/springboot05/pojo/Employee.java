package com.example.springboot05.pojo;


import java.util.Date;

public class Employee {
    private Integer id;
    private String lastName;
    private String email;
    private Integer gander;
    private Department department;
    private Date birth;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGander() {
        return gander;
    }

    public void setGander(Integer gander) {
        this.gander = gander;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Employee() {
    }

    public Employee(Integer id, String lastName, String email, Integer gander, Department department, Date birth) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gander = gander;
        this.department = department;
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gander='" + gander + '\'' +
                ", department=" + department +
                ", birth=" + birth +
                '}';
    }
}
