// 1. find area of diff shapes , circle, square , rectangle using constructors (overloading)(Shape-class)
// 2. Create a class Student - name , rollno , schoolname , one student object will try to update the schoolname (method)
// and then disply details for 2 3 objects
// 3.     class Marks -- m1,m2,m3,m4,m5  , method - calculateMarks()  total 500
//     class StudentDeatils - name,rollm , percentge (child of marks class)
//     displayDetails ( name, rollno , calculatepercentage)
// 4. Create a class calculaet student result and if marks are greater than 100 & <0  , 
//    then throw custom exception for marks not valid



import java.util.Scanner;

 
class Area{

    // Circle
    Area(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    // Square
    Area(int side) {
        System.out.println("Area of Square: " + (side * side));
    }

    // Rectangle
    Area(int length, int breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

};


class Shape{

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    double n = sc.nextInt();
    int s = sc.nextInt();
    int l = sc.nextInt();
    int b = sc.nextInt();

    new Area(n);
    new Area(s);
    new Area(l,b);

    }

}