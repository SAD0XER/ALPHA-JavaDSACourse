import java.util.*;

public class ObjectOrientedProgramming {

    public static void main(String[] para_coder) {
        //Built-in Package Example
        /*Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        System.out.println("a = " + a);*/

        //Creating object of class Pen.
        //Pen Obj1 = new Pen(); /*Now, obj1 had taken space in heap memory. Pen()-This is a constructor of class Pen.*/
        //Change the properties of class using dot operator(.)
//        Obj1.setColor("Magenda"); //Setters
//        Obj1.setThikness(8); //Setters
//        Obj1.setPwd("sarvseh_Password"); //Setters
        /*Obj1.marks[0] = 12;
        Obj1.marks[1] = 13;
        Obj1.marks[2] = 14;*/
        //Printing the array values of Obj1.
        //for (int i = 0; i < Obj1.marks.length; i++) System.out.println(Obj1.marks[i]);
        //Accessing properties of Class
//        System.out.println(Obj1.color);
//        System.out.println(Obj1.thikness);
        /*Obj1.getColor(); //Getters
        Obj1.getThikness(); //Getters
        Obj1.getPwd(); //Getters*/
        //Pen Obj2 = new Pen(Obj1); //created new object
        //Obj1.marks[2] = 145; //Update the value of array.
        //Printing the array values of Obj2.
        //System.out.println("Values After changing.");
        //for (int i = 0; i < Obj2.marks.length; i++) System.out.println(Obj2.marks[i]);

        //Polymorphism: Method Overloading
        /*Calculator calc = new Calculator();
        System.out.println(calc.sum(1, 2));
        System.out.println(calc.sum(1.5f, 2.5f));
        System.out.println(calc.sum(1, 3, 4));*/

        //Polymorphism: Method Overriding.
        /*Deer d = new Deer();
        d.eat();
        Animal a = new Animal();
        a.eat();*/

        //Abstraction.
        /*Horse h = new Horse();
        h.eats();
        h.walk();
        System.out.println(h.color);*/

        /*Chicken c = new Chicken();
        c.eats();
        c.walk();
        System.out.println(c.color);
        c.changeColor();*/

        //Hierarchy of constructor calling.
        //Mustang m = new Mustang();
        //Hierarchy: Animals -> Horse -> Mustang

        //Interface
//        Queen a = new Queen();
//        a.moves();

        //Static and Super Keyword.
//        B b = new B();
//        b.setCo("lal");
//        C c = new C();
//        c.color = "red";
//        c.getCo();
    }
}

//Access Modifiers: Default class
class Pen {
    String color;
    int thikness;
    int age;
    private String pwd;
    int[] marks = new int[3];

    //Non-Parameterised Constructor
    //Pen() {System.out.println("I am Non-Parameterised Constructor");}

    //Parameterised Constructor
    //Pen(int age) {this.age = age; /*'this' keyword used to refer current obj.*/}

    //Shallow copy constructor
    /*Pen(Pen obj) {
        marks = new int[3];
        this.color = obj.color;
        this.thikness = obj.thikness;
        this.marks = obj.marks;
    }*/

    //Deep copy constructor
    /*Pen(Pen obj) {
        marks = new int[3];
        this.color = obj.color;
        this.thikness = obj.thikness;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = obj.marks[i];
        }
    }*/

    //Getters- To return the value
//    void getColor() {System.out.println(this.color);}
//    void getThikness() {System.out.println(this.thikness);}
//    void getPwd() {System.out.println(this.pwd);}
//    void getAge() {System.out.println(this.age);}

    //Setters- To modify a value.
//    void setPwd(String newpwd) {pwd = newpwd;}
//    void setColor(String newColor) {color = newColor;}
//    void setThikness(int newthikness) {thikness = newthikness;}
}

//Polymorphism: Method Overloading
class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

//Polymorphism: Method Overriding.
class Animal {
    void eat() {
        System.out.println("Eats Everything");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("Eats Grass.");
    }
}

//Abstraction: Abstract Classes.
abstract class Animals {
    String color;

    Animals() {
        color = "brown";
        System.out.println("Animal constructor called.");
    }

    //Non-abstract Methods
    void eats() {
        System.out.println("animal eats");
    }

    //Abstract Methods
    abstract void walk();
}

class Horse extends Animals {
    Horse() {
        System.out.println("Horse constructor called.");
    }

    void changeColor() {
        color = "black";
    }

    void walk() {
        System.out.println("walks on 4 legs.");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called.");
    }
}

class Chicken extends Animals {
    void changeColor() {
        color = "Golden";
    }

    void walk() {
        System.out.println("walks on 2 legs.");
    }
}

//Interface
interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal.");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("vertical and horizontal.");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal by one step.");
    }
}

class A {
    static String color;
    int a = 10;
}

class B extends A {
    void setCo(String nC) {
        color = nC;
    }
}

class C extends A {
    void getCo() {
        System.out.println(color);
    }

    C() {
        System.out.println(super.color);
    }
}