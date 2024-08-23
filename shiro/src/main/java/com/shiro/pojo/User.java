package com.shiro.pojo;

public class User {
    private Integer id;
    private String name;
    private Integer passwd;
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

    public Integer getPasswd() {
        return passwd;
    }

    public void setPasswd(Integer passwd) {
        this.passwd = passwd;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public User() {
    }

    public User(Integer id, String name, Integer passwd, String rank) {
        this.id = id;
        this.name = name;
        this.passwd = passwd;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", passwd=" + passwd +
                ", rank='" + rank + '\'' +
                '}';
    }
}
