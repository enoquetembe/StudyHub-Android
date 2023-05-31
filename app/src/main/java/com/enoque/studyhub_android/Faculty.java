package com.enoque.studyhub_android;

public class Faculty {
    private String name;


    public Faculty(String name) {
        this.name = name;
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
}
