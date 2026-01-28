import java.util.Scanner;

class Vowels{
    public static void main(String args[])
    {
        System.out.println("Enter a string");
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();
        int o=0;
        int a=0; 
        int e=0; 
        int i=0;
        int u = 0;
        int c = 0;

        for(int j = 0;j<s.length();j++)
        {

            char cc = s.charAt(j);

            switch (cc) {
                case 'a', 'A' -> {
                    a++;
                    System.out.println("A");
                }
                case 'e', 'E' -> {
                    e++;
                    System.out.println("E");
                }
                
                case 'i', 'I' -> {
                    i++;
                    System.out.println("I");
                }
                case 'o', 'O' -> {
                    o++;
                    System.out.println("O");
                } 

                case 'u', 'U' -> {
                    u++;
                    System.out.println("U");
                }
                default -> c++;

            }
            
        }
        
        
            System.out.println("Vowels = "+ (a+e+i+o+u));
            System.out.println("Consonents = "+ c);
    }
}