// 2. Create a class Student - name , rollno , schoolname , one student object will try to update the schoolname (method)
// and then disply details for 2 3 objects

import java.util.Scanner;

class Student
{
    String name;
    int roll_no;
    String schoolname;

    Student(String name, int roll_no, String schoolname)
    {
        this.name = name;
       this.roll_no = roll_no; 
        this.schoolname = schoolname;
    };

    void Display()
    {
        System.out.println("Student's Name is " + name);
        System.out.println("His Roll no. is "+ roll_no);
        System.out.println("He Studies in " + schoolname + " School");
    }
}


class StudentInfo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Name = sc.next();
        int Roll = sc.nextInt();
        String School = sc.next();

        Student info = new Student(Name,Roll,School);
        info.Display();
    }
}
