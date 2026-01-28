
import java.util.Scanner;

class Right_Tringle_Pattern{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a no. and see its Right angle tiriangle form ->");

        int n=scan.nextInt();
        for(int i=1;i<=1;i++)
        {
            for(int j=1;j<=n;j++)
            {
                int k=i;
                
                if(i!=j)
                {
                    while(k<=j)
                    {
                        System.out.print(k);
                        k++;
                    }

                    System.out.println();
                }

                else if(i==j)
                    System.out.println(j);


            }
        }

    }

}
// -----------------------------------------------------------------------------------------------------------------------------------------------------------------------




