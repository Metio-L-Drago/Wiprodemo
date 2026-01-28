import java.util.Scanner;

class Duplicate{
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        System.out.println("Enter the size of Array and Elements");
        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i =0;i<n;i++)
            arr[i] = scan.nextInt();

        duplicate_ele(arr);
        square(arr);
        factorial(arr);

    }

    static void duplicate_ele(int[] arr)
    {   
        int n = arr.length;
        int arr2[] = new int[n];
    
        for(int i=0;i<n;i++)
            arr2[i] = arr[i];

        int dup[] = new int[n];
        int k = 0;


        for(int i=0;i<n;i++)
        {
            if(arr2[i] == -1)
                continue;

            boolean f = false;

            for(int j=i+1;j<n;j++)
            {
                if(arr2[j] == arr2[i])
                {
                    f = true;
                    arr2[j]=-1;
                }
            }

            if(f){
                dup[k++] = arr2[i];
                arr2[i] = -1; 
            }
        }

        System.out.println();
        System.out.println("Find all the Duplicate Elements in Array");
        System.out.print("[");

        for(int i=0;i<k;i++)
        {
            System.out.print(dup[i]);
            
            if(i<k-1)
                System.out.print(", ");

        }
        System.out.println("]");

    }

    static void square(int[] arr){
        int n = arr.length;
        int[] arr2 = new int[n];

        for(int i = 0;i<n;i++)
            arr2[i] = arr[i]*arr[i];
            
        System.out.println();
        System.out.println("Square of all Elements in Array");
        System.out.println(java.util.Arrays.toString(arr2));

    }

    static void factorial(int[] arr)
    {
        int n = arr.length;
        for(int i = 0;i<n;i++)
        {
            int d = arr[i];
            for(int j=d-1;j>0;j--)
                d*=j;

            arr[i] = d;
        }

        System.out.println();
        System.out.println("Factorial of all Elements in Array");
        System.out.println(java.util.Arrays.toString(arr));
    }
}