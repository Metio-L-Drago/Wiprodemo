import java.util.Scanner;

class Welcome{
    public static void main(String args[]){

        System.out.println("Welcome");

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter an Integer, String and Float value");

        int a = scan.nextInt();
        String b = scan.next();
        float c  = scan.nextFloat();

        System.out.println("INT = " + a + " STRING = "+ b + " fLOAT = " + c );



    }
}