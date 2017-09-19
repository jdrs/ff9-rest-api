package com.github.jdrs.ff9.entity;

public class Character {

    private int id;
    private String name;
    private int age;
    private Location home;

    public Character() {

    }

    public Character(int id, String name, int age, Location home) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.home = home;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Location getHome() {
        return home;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(Location home) {
        this.home = home;
    }
}
