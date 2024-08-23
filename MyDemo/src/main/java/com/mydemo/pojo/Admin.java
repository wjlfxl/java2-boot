package com.mydemo.pojo;

import org.springframework.stereotype.Component;

//@Component     //加载到Spring IOC容器（让Spring 管理）
public class Admin {
    private Integer id;
    private String name;
    private String password;
    private String people;
    private String rank;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Admin() {
    }

    public Admin(Integer id, String name, String password, String people, String rank) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.people = people;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password=" + password +
                ", people='" + people + '\'' +
                ", rank=" + rank +
                '}';
    }
}
