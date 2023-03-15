//3) What is method overloading?
//Method overloading allows us to define multiple methods with the same name using different parameters
public class Overloading {

    // First Use of Plus Method for int
    static int plusMethod(int x, int y) {
        return x + y;
    }
    // Second use of Plus Method for double
    static double plusMethod(double x, double y) {
        return x + y;
    }
    //This way you can call the plusMethod method and input your numbers without worried about format
    //for this example it'd be a good idea to create a separate class filled with overloaded methods to handle any number input.
    //although i think there is a way to make a method that would check the formats you're trying to put in and move it into an appropriate method
    public static void main(String[] args) {
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}