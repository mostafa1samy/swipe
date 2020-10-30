
package com.example.mostafa.swip.model;


import com.google.gson.annotations.Expose;


@SuppressWarnings("unused")
public class Pdf {

    @Expose
    private Boolean isAvailable;

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

}
