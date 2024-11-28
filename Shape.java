public class Shape {
    public void draw() {
        System.out.println("Inside Shape::draw() method.");
    }
}

public class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

public class TestShape {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();
        Shape shape3;
        
        shape1.draw();
        shape2.draw();
        shape3 = shape1;
        shape3.draw();
        shape1.draw();
    }
}
