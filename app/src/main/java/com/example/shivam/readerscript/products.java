package com.example.shivam.readerscript;

/**
 * Created by shivam on 24/03/18.
 */

public class products {
    private   String productid;
    private   String name;
    private   int discountpercentage;
    private   int discounttimer;
    private   int quantity;
    private   String description;
    private   String imageurl;

    public products(String productid, String name, int discountpercentage, int discounttimer, int quantity, String description, String imageurl) {
        this.productid = productid;
        this.name = name;
        this.discountpercentage = discountpercentage;
        this.discounttimer = discounttimer;
        this.quantity = quantity;
        this.description = description;
        this.imageurl = imageurl;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiscountpercentage() {
        return discountpercentage;
    }

    public void setDiscountpercentage(int discountpercentage) {
        this.discountpercentage = discountpercentage;
    }

    public int getDiscounttimer() {
        return discounttimer;
    }

    public void setDiscounttimer(int discounttimer) {
        this.discounttimer = discounttimer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }
}
