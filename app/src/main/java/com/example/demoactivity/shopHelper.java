package com.example.demoactivity;

public class shopHelper {
    String Name,Email,Adress,Itemvalue,price,mobile;

    public shopHelper() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public String getItemvalue() {
        return Itemvalue;
    }

    public void setItemvalue(String itemvalue) {
        Itemvalue = itemvalue;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public shopHelper(String name, String email, String adress, String itemvalue, String price, String mobile) {
        Name = name;
        Email = email;
        Adress = adress;
        Itemvalue = itemvalue;
        this.price = price;
        this.mobile = mobile;
    }


}
