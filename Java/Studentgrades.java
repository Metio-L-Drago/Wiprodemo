//3.   class Marks -- m1,m2,m3,m4,m5  , method - calculateMarks()  total 500
//     class StudentDeatils - name,rollm , percentge (child of marks class)
//     displayDetails ( name, rollno , calculatepercentage)


import java.util.Scanner;

class Marks {
    int m1, m2, m3, m4, m5;
    int total_m;

    Marks(int m1, int m2, int m3, int m4, int m5) {

        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
        this.m5 = m5;
    }

    int calculateMarks() {
        total_m = m1 + m2 + m3 + m4 + m5;
        return total_m;
    }
}

class StudentDetails extends Marks {
    String name;
    int rollno;
    float percentage;

    StudentDetails(String name, int rollno, int m1, int m2, int m3, int m4, int m5) {

        super(m1, m2, m3, m4, m5); 
        this.name = name;
        this.rollno = rollno;
    }

    void displayDetails() {
        System.out.println("Student name: " + name);
        System.out.println("Roll No: " + rollno);

        percentage = (calculateMarks() / 500.0f) * 100;

        System.out.printf("Percentage: %.2f%%%n", percentage);
    }
}

class Studentgrades {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student's Name:");
        String name = sc.nextLine();

        System.out.println("Enter Student's Roll No:");
        int rollno = sc.nextInt();

        int m1, m2, m3, m4, m5;

        System.out.println("Enter marks for 5 subjects (0–100):");

        while (true) {
            m1 = sc.nextInt();
            if (m1 >= 0 && m1 <= 100) break;
            System.out.println("Invalid marks! Enter again:");
        }

        while (true) {
            m2 = sc.nextInt();
            if (m2 >= 0 && m2 <= 100) break;
            System.out.println("Invalid marks! Enter again:");
        }

        while (true) {
            m3 = sc.nextInt();
            if (m3 >= 0 && m3 <= 100) break;
            System.out.println("Invalid marks! Enter again:");
        }

        while (true) {
            m4 = sc.nextInt();
            if (m4 >= 0 && m4 <= 100) break;
            System.out.println("Invalid marks! Enter again:");
        }

        while (true) {
            m5 = sc.nextInt();
            if (m5 >= 0 && m5 <= 100) break;
            System.out.println("Invalid marks! Enter again:");
        }

        StudentDetails st =
                new StudentDetails(name, rollno, m1, m2, m3, m4, m5);

        st.displayDetails();
        sc.close();
    }
}


//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------


// 4.  Create a class calculaet student result and if marks are greater than 100 & <0  , 
//    then throw custom exception for marks not valid

/*import java.util.Scanner;

class Marks{
    int m1,m2,m3,m4,m5;
    int total_m;

    Marks(int m1,int m2,int m3,int m4,int m5) throws InvalidMarksException
    {
        validate(m1);
        validate(m2);
        validate(m3);
        validate(m4);
        validate(m5);

        this.m1 = m1; 
        this.m2 = m2; 
        this.m3 = m3; 
        this.m4 = m4; 
        this.m5 = m5; 
    }

    void validate(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks not valid: " + marks);
        }
    }

    int Calculate_Marks()
    {
        total_m = m1+m2+m3+m4+m5;
        return total_m;
    }
}

class StudentDetails extends Marks{
    String name;
    int rollno;
    float percentage;

    StudentDetails(String name, int rollno, int m1, int m2, int m3, int m4, int m5) throws InvalidMarksException{
        super(m1,m2,m3,m4,m5);
        this.name = name;
        this.rollno = rollno;

    }

    

    void displayDetails()
    {
        System.out.println("Student name is "+ name);
        System.out.println("Student's Roll No. is "+ rollno);
        
        percentage = ( Calculate_Marks() / 500.0f) * 100;

        System.out.printf("Percentage: %.2f%%%n", percentage);


    }
}

class InvalidMarksException extends Exception {

    InvalidMarksException(String message) {
        super(message);
    }
}

class Studentgrades{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

    try{
        System.out.println("Enter Student's Name");
        String name = sc.nextLine();

        System.out.println("Enter Student's Roll no.");
        int rollno = sc.nextInt();

        int m1,m2,m3,m4,m5;

        System.out.println("Enter marks for 5 subjects (0–100):");

        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        m4 = sc.nextInt();
        m5 = sc.nextInt();

        StudentDetails st = new StudentDetails(name, rollno,m1,m2,m3,m4,m5);
        st.displayDetails();
    }

    catch (InvalidMarksException e)
    {
        System.out.println("Error: " + e.getMessage());
    }

    sc.close();

    }
}*/