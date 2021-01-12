package interfaced;

/***
 * Бегает до 200 м
 * прыгает до 2м
 * не умеет плавать
 */

public class Cat implements Animal {


    private String name = "Котик";
    private double runDistance = 200;
    private double swimDistance = 0;
    private double jumpHeight = 2;

    public Cat() {
    }

    public Cat(String name, double runDistance, double swimDistance, double jumpHeight) {
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

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat);
        cat.run(10);
        cat.run(300);
        cat.swim(1);

        Cat manul = new Cat("Манул", 70, 2, 1);
        System.out.println(manul);
        manul.swim(1);
        manul.jump(1);
        manul.jump(2);

    }
}
