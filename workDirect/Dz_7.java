package ru.geekbrains.java1.dz_Enver_Eskendarov.dz7;

import java.util.ArrayList;

public class Dz_7 {
    public static void main(String[] args) {
        // создаем новых кошек (имя, аппетит) в массиве "Cats"
        ArrayList<Cat> Cats = new ArrayList<Cat>();
        Cats.add(new Cat("Тень", 80));
        Cats.add(new Cat("Тигр", 105));
        Cats.add(new Cat("Ангел", 70));
        Cats.add(new Cat("Багира", 50));
        // наполняем миску едой
        Bowl food = new Bowl(190);
        // Проходим по массиву данных кошек и выполняем для каждого метод " eat "
        for (Cat i : Cats) {
            i.eat(food);
        }
        food.addToBowl(300); // вызываем метод добавки еды
        for (Cat i : Cats) {
            i.eat(food);
        }
    }
}