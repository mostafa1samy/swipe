
package com.example.mostafa.swip.model;


import com.google.gson.annotations.Expose;


@SuppressWarnings("unused")
public class SaleInfo {

    @Expose
    private String country;
    @Expose
    private Boolean isEbook;
    @Expose
    private String saleability;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Boolean getIsEbook() {
        return isEbook;
    }

    public void setIsEbook(Boolean isEbook) {
        this.isEbook = isEbook;
    }

    public String getSaleability() {
        return saleability;
    }

    public void setSaleability(String saleability) {
        this.saleability = saleability;
    }

}
