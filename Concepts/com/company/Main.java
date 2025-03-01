package com.company;

class Student{
    private int age = 5;
    private String name;

    public void setAge(int a){
        age = a;
    }

    public int getAge(){
        return age;
    }

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }
}

public class Main{
    public static void main(String[] args) {
        Student myObj = new Student();
        myObj.setAge(19);
        System.out.println(myObj.getAge());
        myObj.setName("Dhruv");
        System.out.println(myObj.getName());
    }
}