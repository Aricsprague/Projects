//2) What is a subclass?
//subclass (child) - the class that inherits from another class
//superclass (parent) - the class being inherited from
public class Subclass extends Superclass { //Subclass inherits from superclass, so flavors are available. subclass is used for ordering

        private String size = "Three scoops!";    // Size attribute
        public static void main(String[] args) {

            // Create a myIceCream object
            Subclass myIceCream = new Subclass();

            // Call the exclaim() method (from the Vehicle class) on the myIceCream object
            myIceCream.exclaim();

            // Display the value of the flavor attribute (from the superclass) and the value of size from the subclass
            System.out.println(myIceCream.flavor + ", " + myIceCream.size);
        }

}
