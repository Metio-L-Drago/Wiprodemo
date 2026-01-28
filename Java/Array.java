import java.util.Scanner;

class Array{
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of Array and Elements");

        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = scan.nextInt();
       
        System.out.println();
        System.out.println("Sum of all the elements in the Array");
        System.out.println(array_sum(arr));

        System.out.println();
        System.out.println("Maximum Element in the Array");
        System.out.println(array_max(arr));
        
        array_odd(arr);

    }

    static int array_sum(int[] arr){
        int sum =0;
        for(int i=0;i<arr.length;i++)
            sum+=arr[i];

        return sum;
    }

    static int array_max(int[] arr)
    {
        int max = arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(max<arr[i])
            max= arr[i];
        }

        return max;
    }

    static void array_odd(int[] arr)
    {
        int c =0;
        for(int i=0;i<arr.length;i++)
            if(arr[i]%2!=0)
                c++;

        int k=0;
        int[] arr2 = new int[c];
        for(int i=0;i<arr.length;i++)
            if(arr[i]%2!=0){
                arr2[k] = arr[i];
                k++;
            }
            

        System.out.println();
        System.out.println("All the Odd no. in the Array");
        for(int i=0;i<arr2.length;i++)
        System.out.print(arr2[i]+" ");
    }
}