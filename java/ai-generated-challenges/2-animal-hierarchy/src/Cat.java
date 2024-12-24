public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("Cat meows");
    }

    // Overloaded speak method to meow multiple times in one line
    public void speak(int times) {
        StringBuilder meows = new StringBuilder("Cat meows " + times + " times: ");
        for (int i = 0; i < times; i++) {
            meows.append("Meow! ");
        }
        System.out.println(meows.toString().trim()); // Trim to remove the trailing space
    }
}
