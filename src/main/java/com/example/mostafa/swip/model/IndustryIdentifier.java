
package com.example.mostafa.swip.model;


import com.google.gson.annotations.Expose;


@SuppressWarnings("unused")
public class IndustryIdentifier {

    @Expose
    private String identifier;
    @Expose
    private String type;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
