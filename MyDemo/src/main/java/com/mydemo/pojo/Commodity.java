package com.mydemo.pojo;

public class Commodity {
    private Integer id;
    private String name;
    private String type;
    private Integer amount;
    private double price;
    private String time;
    private String apeople;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getApeople() {
        return apeople;
    }

    public void setApeople(String apeople) {
        this.apeople = apeople;
    }

    public Commodity() {
    }

    public Commodity(Integer id, String name, String type, Integer amount, double price, String time, String apeople) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.amount = amount;
        this.price = price;
        this.time = time;
        this.apeople = apeople;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                ", time='" + time + '\'' +
                ", apeople='" + apeople + '\'' +
                '}';
    }
}

