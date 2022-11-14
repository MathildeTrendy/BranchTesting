public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Vuf");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public boolean mood(String moodType) {
        return true;
    }
}
