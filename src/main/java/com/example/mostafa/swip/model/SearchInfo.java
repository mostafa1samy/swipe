
package com.example.mostafa.swip.model;


import com.google.gson.annotations.Expose;


public class SearchInfo {

    @Expose
    private String textSnippet;

    public String getTextSnippet() {
        return textSnippet;
    }

    public void setTextSnippet(String textSnippet) {
        this.textSnippet = textSnippet;
    }

}
