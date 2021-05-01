package com.janjanee;

public class Coffee {

    private Integer id;

    private String name;

    private boolean sweet;

    public Coffee(Integer id, String name, boolean sweet) {
        this.id = id;
        this.name = name;
        this.sweet = sweet;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSweet() {
        return sweet;
    }

    public void setSweet(boolean sweet) {
        this.sweet = sweet;
    }
}
