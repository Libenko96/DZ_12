package com.newproject;


import java.util.ArrayList;
import java.util.Random;

/*Создать list из 100 обьектов типа Person заполненных случайными данными (Например создать массив на несколько имен и выбирать из него случайным образом).
* */
public class Person_list {
    public static void main(String[] args) {
        Random random = new Random();
        String [] arrName = {"Вася","Петя","Жора","Игорь","Марина","Женя"};
        ArrayList<Person> listName = new ArrayList<>();
        String name = "";

        for (int i = 0; i < 100; i++) {
             name = arrName[random.nextInt(6)];
             listName.add(new Person(name));
        }
    }
}
