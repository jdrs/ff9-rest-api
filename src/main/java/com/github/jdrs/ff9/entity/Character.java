package com.github.jdrs.ff9.entity;

public class Character {

    private int id;
    private String name;
    private int age;
    private String occupation;
    private Location home;

    public Character() {

    }

    public Character(int id, String name, int age, String occupation, Location home) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.occupation = occupation;
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

    public String getOccupation() {
        return occupation;
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

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setHome(Location home) {
        this.home = home;
    }
}
