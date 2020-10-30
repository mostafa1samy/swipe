
package com.example.mostafa.swip.model;


import com.google.gson.annotations.Expose;


@SuppressWarnings("unused")
public class Epub {

    @Expose
    private String acsTokenLink;
    @Expose
    private Boolean isAvailable;

    public String getAcsTokenLink() {
        return acsTokenLink;
    }

    public void setAcsTokenLink(String acsTokenLink) {
        this.acsTokenLink = acsTokenLink;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

}
