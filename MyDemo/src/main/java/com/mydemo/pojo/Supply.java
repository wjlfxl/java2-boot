package com.mydemo.pojo;

public class Supply {
    private Integer id;
    private Merchant merchant;
    private Commodity commodity;
    private String type;
    private Integer amount;
    private double price;
    private String time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
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

    public Supply() {
    }

    public Supply(Integer id, Merchant merchant, Commodity commodity, String type, Integer amount, double price, String time) {
        this.id = id;
        this.merchant = merchant;
        this.commodity = commodity;
        this.type = type;
        this.amount = amount;
        this.price = price;
        this.time = time;
    }


    @Override
    public String toString() {
        return "Stock{" +
                "id=" + id +
                ", merchant=" + merchant +
                ", commodity=" + commodity +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                ", time='" + time + '\'' +
                '}';
    }
}


