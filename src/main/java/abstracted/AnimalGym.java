package abstracted;

import abstracted.model.TheCat;
import abstracted.model.TheDog;

public class AnimalGym {

    public static void main(String[] args) {

        System.out.println("Тренируются котики");
//      Бегает до 200 м, прыгает до 2м, не умеет плавать
        TheCat cat = new TheCat();
        System.out.println(cat);
        cat.run(200);
        cat.run(201);
        cat.jump(2);
        cat.jump(2.1);
        cat.swim(1);
        System.out.println();


        TheCat nyansus = new TheCat("Нянсус", 150, 0,  1);
        System.out.println(nyansus);
        nyansus.run(150);
        nyansus.run(151);
        nyansus.jump(1);
        nyansus.jump(1.1);
        nyansus.swim(1);

//      бег 500, плавание 10, прыг 0.5
        System.out.println();
        System.out.println("Тренируются собаки");
        TheDog dog = new TheDog();
        System.out.println(dog);
        dog.run(500);
        dog.run(501);
        dog.swim(10);
        dog.swim(11);
        dog.jump(0.5);
        dog.jump(0.6);
        System.out.println();

        TheDog hound = new TheDog("Белый", 800, 12, 0.5);
        System.out.println(hound);
        hound.run(800);
        hound.run(802);
        hound.swim(12);
        hound.swim(14);
        hound.jump(0.5);
        hound.jump(0.6);
    }
}
