package lecture6;

public class Earth {
    public static void main(String[] args) {
        Human tom;
        tom = new Human();
        tom.speak();
        System.out.print(System.lineSeparator());
        tom.age = 5;
        tom.eyeColor = "blue";
        tom.name = "Tom";
        tom.heightInInches = 72;
        tom.speak();
    }
}
