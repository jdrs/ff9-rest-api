package com.github.jdrs.ff9.entity;

public class Location {
    private int id;
    private String name;
    private String type;
    private String region;

    public Location() {

    }

    public Location(int id, String name, String type, String region) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.region = region;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getRegion() {
        return region;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
