package com.enoque.studyhub_android;

public class Discipline {
    private String name;

    @Override
    public String toString() {
        return "Discipline{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Discipline(String name) {
        this.name = name;
    }

    public Discipline() {
    }
}
