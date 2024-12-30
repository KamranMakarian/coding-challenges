public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("Dog barks");
    }

    // Overloaded speak method to bark multiple times in one line
    public void speak(int times) {
        StringBuilder barks = new StringBuilder("Dog barks " + times + " times: ");
        for (int i = 0; i < times; i++) {
            barks.append("Bark! ");
        }
        System.out.println(barks.toString().trim()); // Trim to remove the trailing space
    }
}
