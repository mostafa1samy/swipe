
package com.example.mostafa.swip.model;

import java.util.List;

import com.google.gson.annotations.Expose;


@SuppressWarnings("unused")
public class Total {

    @Expose
    private List<Item> items;
    @Expose
    private String kind;
    @Expose
    private Long totalItems;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Long getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Long totalItems) {
        this.totalItems = totalItems;
    }

}
