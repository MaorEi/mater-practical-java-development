package lecture6;

public class Human {
    public Human() {
    }

    int age;
    String name;
    String eyeColor;
    int heightInInches;

    public void speak() {
        System.out.println("My name is " + name + " and I am " + age + "years old");
        System.out.println("My height is " + heightInInches + " inches tall");
        System.out.println("My eye color is: " + eyeColor);
    }

    public void work() {
        System.out.println("working....");
    }

    public void eat() {
        System.out.println("eating...");
    }

}
