/*Encapsulation. The practice of keeping fields within a class private, t
hen providing access to those fields via public methods.
Encapsulation is a protective barrier that keeps the data and code safe within the class itself.
We can then reuse objects like code components or variables without allowing open access to the data system-wide.*/

// fields to calculate area
class Area {

    int length;
    int width;

    // constructor to initialize values
    Area(int length, int breadth) {
        this.length = length;
        this.width = breadth;
    }

    // method to calculate area
    public void getArea() {
        int area = length * width;
        System.out.println("Area: " + area);
    }
}

class Encapsulation {
    public static void main(String[] args) {

        Area rectangle = new Area(2, 16);
        rectangle.getArea();
    }
}