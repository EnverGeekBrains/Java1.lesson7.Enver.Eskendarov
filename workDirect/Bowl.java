package ru.geekbrains.java1.dz_Enver_Eskendarov.dz7;

public class Bowl {         // создаем класс Миска
    public int food;

    public Bowl(int food) {
        this.food = food;
    }

    // метод возвращает остаток еды после метода " eat "
    public void takeFood(int appetite) {
        if (appetite <= food) {
            food -= appetite;
        }

    }

    // метод добавки еды в миску
    public void addToBowl(int add) {
        food += add;
        System.out.println("В миску добавили " + add + "мл. молока, теперь в миске " + food + "мл. молока");
    }
}