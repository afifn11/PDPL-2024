abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

class RoundedRectangle extends Shape {
    void draw() {
        System.out.println("Inside RoundedRectangle::draw() method.");
    }
}

class RoundedSquare extends Shape {
    void draw() {
        System.out.println("Inside RoundedSquare::draw() method.");
    }
}

abstract class AbstractFactory {
    abstract Shape getShape(String shapeType);
}

class ShapeFactory extends AbstractFactory {
    Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}

class RoundedShapeFactory extends AbstractFactory {
    Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new RoundedRectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new RoundedSquare();
        }
        return null;
    }
}

class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded) {
        if (rounded) {
            return new RoundedShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }
}

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();
        
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();
        
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        Shape shape3 = shapeFactory1.getShape("RECTANGLE");
        shape3.draw();
        
        Shape shape4 = shapeFactory1.getShape("SQUARE");
        shape4.draw();
    }
}
