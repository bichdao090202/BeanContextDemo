package org.example.models;

public class Faculty {

    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public Faculty() {
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
