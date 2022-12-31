Public class ObjectOrientedProgramming {
Public static void main(String[] para_coder) {
//Creating object of class Pen.
Pen Obj1 = new Pen();
/*Now, obj1 had taken space in heap memory.
Pen()-This is a constructor of class Pen.*/

//Change the properties of class using dot operator(.)
Obj1.setColor("Magenda");
Obj1.setThikness(8);

System.out.println(Obj1.color);
System.out.println(Obj1.thikness);
}
}

//default class
class Pen {
String color;
int thikness;

void setColor(String newColor) {
color = newColor;
}

void setThikness(int newthikness) {
thikness = newthikness;
}
}
