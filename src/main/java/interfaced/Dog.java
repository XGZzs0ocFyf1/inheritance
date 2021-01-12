package interfaced;

/***
 * бег 500м
 * плавание 10м
 * прыжок 0.5 м
 */
public class Dog implements Animal {

    private String name = "Пёсель";
    private double runDistance = 500;
    private double swimDistance = 10;
    private double jumpHeight = 0.5;

    public Dog() {
    }

    public Dog(String name, double runDistance, double swimDistance, double jumpHeight) {
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
        String distance = swimDistance == 0 ? "не умеет плавать " : "плавает на расстояние " + swimDistance;
        return name + " {" +
                "бегает на расстояние " + runDistance +
                "м, " + distance +
                "м, прыгает на высоту " + jumpHeight +
                "м}";
    }


    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog);
        dog.run(10);
        dog.run(500);
        dog.run(600);
        dog.jump(15);
        dog.jump(0.3);

        Dog hound = new Dog("Гончая", 600, 10, 2);
        hound.run(600);
        hound.run(700);
        hound.swim(10);
        hound.swim(11);
        hound.jump(2);
        hound.jump(3);

    }
}
