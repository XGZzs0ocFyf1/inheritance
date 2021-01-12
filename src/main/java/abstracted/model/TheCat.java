package abstracted.model;
/***
 * Бегает до 200 м
 * прыгает до 2м
 * не умеет плавать
 */

public class TheCat extends AbstractAnimal{

    public TheCat() {
        configureAnimal("Котик", 200, 0, 2);
    }

    public TheCat(String name, double runDistance, double swimDistance, double jumpHeight){
        configureAnimal(name, runDistance, swimDistance, jumpHeight);
    }


}
