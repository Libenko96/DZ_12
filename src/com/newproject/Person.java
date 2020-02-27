package com.newproject;
/*
* Создать класс Person который описывает человека, с полями: имя, фамилия, возраст, вес, рост.

Создать один или несколько конструкторов которые гарантирует что у каждого есть имя, фамилия.

Создать list из 100 обьектов типа Person заполненных случайными данными (Например создать массив на несколько имен и выбирать из него случайным образом ).
* */

public class Person {
    private String name;
    private String surname;
    private byte age;
    private int weight;
    private int height;

    public Person(String name){
        this.name = name;
    }

    public Person(String name,String surname){
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
