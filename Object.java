class Dog {
    private String name;
    private String breed;
    private int age;
    private String color;

    // Constructor
    public Dog(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    // Overriding the toString() method
    @Override
    public String toString() {
        return "Hi my name is " + this.getName() +
               ".\nMy breed, age and color are " + 
               this.getBreed() + ", " + this.getAge() + ", " + this.getColor();
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Dog tuffy = new Dog("tuffy", "papillon", 5, "white");
        System.out.println(tuffy.toString());
    }
}
