package abstracted.model;
/***
 * бег 500м
 * плавание 10м
 * прыжок 0.5 м
 */
public class TheDog extends AbstractAnimal{

    public TheDog() {
        configureAnimal("Песель", 500, 10, 0.5);
    }

    public TheDog(String name, double runDistance, double swimDistance, double jumpHeight){
        configureAnimal(name, runDistance, swimDistance, jumpHeight);
    }
}
