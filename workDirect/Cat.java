package ru.geekbrains.java1.dz_Enver_Eskendarov.dz7;

// создаем класс питомца
public class Cat {
    public String petName;                 //  имя животного
    public int appetite;                   //  аппетит
    public boolean satiety;                //  сытость

    public Cat(String petName, int appetite) {
        this.petName = petName;
        this.appetite = appetite;
    }

    // метод возвращает результат о сытости питомцем и инфо о количестве еды в миске
    void eat(Bowl bowl) {
        if (appetite <= bowl.food) {
            System.out.println(petName + " попил молока");
            bowl.takeFood(appetite);
            satiety = true;

        } else {
            satiety = false;
            System.out.println("Молока настолько мало что " + petName + " даже не притронулся к миске");
        }

        System.out.println("Порция еды для " + petName + " составляет " + appetite + "мл. молока, Питомец " + petName + " сытый?: (" + satiety + ")");
        System.out.println("Остаток молока в миске: " + bowl.food + "мл.");
    }
}