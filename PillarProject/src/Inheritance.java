/*Inheritance. A special feature of Object-Oriented Programming in Java,
Inheritance lets programmers create new classes that share some of the attributes of existing classes.
Using Inheritance lets us build on previous work without reinventing the wheel.*/

// Base or Super Class
class Employee {
    int salary = 60000;
}

// Inherited or Sub Class
class Developer extends Employee {
    int benefits = 10000;
}

// Driver Class
class Inheritance {
    public static void main(String args[])
    {
        Developer dave = new Developer();
        System.out.println("Salary : " + dave.salary
                + "\nBenefits : " + dave.benefits);
    }
}