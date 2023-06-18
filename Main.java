public class Main {

    public static void main(String[] args) {
        Circle c1 = new Circle(10f);
        printCircle(c1);
        c1.setRadius(-5f);
        printCircle(c1);
    }

    public static void printCircle(Circle c) {
        System.out.println("radius of circle = "+c.getRadius()+'\n'+"area of circle = "+c.area());
    }


}

class Circle {
    private float radius; // private access modifier
    public static final float PI = 3.1414f;

    public Circle(float radius) {
        // Using setter inside constructor to assign value
        setRadius(radius);
    }

    // Created specifically for area method
    // Cannot be accessed outside the particular class
    private float square(float radius) {
        return radius * radius;
    }

    public float area() {
        return PI * square(this.radius);
    }

    // Getter Method - To read the value of private attribute from outside the class.
    // Should have the same return type as the variable
    public float getRadius() {
        return this.radius;
    }

    // Setter Method - To update the value of private attribute from outside the class.
    // Void method as it doesn't return anything.
    // Takes parameter which is of the same type as the attribute we are trying to change.
    public void setRadius(float radius) {
        if (radius>=0f) {
            this.radius = radius;
        }
    }
}