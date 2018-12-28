package com.simple.jacocolibrary;

public class JacocoJava {
    private String namePrivate = "private";
    protected String nameProtected = "protected";
    String nameDefault = "default";
    public String namePublic = getClass().getName();

    private int getSumPrivate(int a, int b) {
        return a + b;
    }

    int getSumDefault(int a, int b) {
        return a + b;
    }

    protected int getSumProtected(int a, int b) {
        return a + b;
    }

    public int getSumPublic(int a, int b) {
        return a + b;
    }
}
