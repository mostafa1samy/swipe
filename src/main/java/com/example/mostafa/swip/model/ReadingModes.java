
package com.example.mostafa.swip.model;


import com.google.gson.annotations.Expose;

@SuppressWarnings("unused")
public class ReadingModes {

    @Expose
    private Boolean image;
    @Expose
    private Boolean text;

    public Boolean getImage() {
        return image;
    }

    public void setImage(Boolean image) {
        this.image = image;
    }

    public Boolean getText() {
        return text;
    }

    public void setText(Boolean text) {
        this.text = text;
    }

}
