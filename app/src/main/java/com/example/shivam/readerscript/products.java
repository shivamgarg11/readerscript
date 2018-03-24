package com.example.shivam.readerscript;

/**
 * Created by shivam on 24/03/18.
 */

public class products {
    private   String productid;
    private   String name;
    private   String discountpercentage;
    private   String discounttimer;
    private   String quantity;
    private   String description;
    private   String imageurl;

    public products(String productid, String name, String discountpercentage, String discounttimer, String quantity, String description, String imageurl) {
        this.productid = productid;
        this.name = name;
        this.discountpercentage = discountpercentage;
        this.discounttimer = discounttimer;
        this.quantity = quantity;
        this.description = description;
        this.imageurl = imageurl;
    }

    public products(){

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

    public String getDiscountpercentage() {
        return discountpercentage;
    }

    public void setDiscountpercentage(String discountpercentage) {
        this.discountpercentage = discountpercentage;
    }

    public String getDiscounttimer() {
        return discounttimer;
    }

    public void setDiscounttimer(String discounttimer) {
        this.discounttimer = discounttimer;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
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
