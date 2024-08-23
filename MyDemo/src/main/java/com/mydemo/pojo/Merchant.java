package com.mydemo.pojo;

public class Merchant {
    private Integer id;
    private String people;
    private String company;
    private String address;
    private String phone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Merchant() {
    }

    public Merchant(Integer id, String people, String company, String address, String phone) {
        this.id = id;
        this.people = people;
        this.company = company;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Merchant{" +
                "id=" + id +
                ", people='" + people + '\'' +
                ", company='" + company + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
