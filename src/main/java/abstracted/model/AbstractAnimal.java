package abstracted.model;

import interfaced.Animal;

public class AbstractAnimal implements Animal {


    private String name = "Животное";
    private double runDistance = 10;
    private double swimDistance = 0;
    private double jumpHeight = 2;

    public void configureAnimal(String name, double runDistance, double swimDistance, double jumpHeight){
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run(double distance) {
        String tryResult = getTryResult(distance, runDistance);
        System.out.printf(name + " пытался пробежать %sм и у него %s.\n", distance, tryResult);

    }

    @Override
    public void swim(double distance) {
        if (swimDistance == 0) {
            System.out.println(name + " не умеет плавать.");
            return;
        }
        String tryResult = getTryResult(distance, swimDistance);
        System.out.printf(name + " пытался проплыть %sм и у него %s.\n", distance, tryResult);
    }

    @Override
    public void jump(double obstacleHeight) {
        String tryResult = getTryResult(obstacleHeight, jumpHeight);
        System.out.printf(name + " пытался перепрыгнуть препятствие высотой %sм и у него %s.\n", obstacleHeight,
                tryResult);

    }

    private String getTryResult(double tryDistance, double readDistance) {
        return tryDistance <= readDistance ? "получилось" : "не получилось";
    }


    @Override
    public String toString() {
        String distance = swimDistance == 0 ? "не умеет плавать" : "плавает на расстояние " + swimDistance + " м";
        return name + " {" +
                "бегает на расстояние " + runDistance +
                "м, " + distance +
                ", прыгает на высоту " + jumpHeight +
                "м}";
    }
}
