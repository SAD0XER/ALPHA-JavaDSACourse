public class ObjectOrientedProgramming {

    public static void main(String[] para_coder) {
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
    }
}

//default class
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
