import java.util.Scanner;

public class Secondlargest 
{
   public void display()
   {
	   Scanner sc = new Scanner(System.in);
       int a;
       System.out.println(" Enter the number of elements ");
       a = sc.nextInt();
       int arr[] = new int[a];
       System.out.println("Enter the array elements");
       // For Printing an array
       for(int i=0;i<a;i++)
       {
       	arr[i]=sc.nextInt();
       }
       // For Finding the second largest number
       int largest = arr[0];
       int secondLargest = arr[0];
       for(int i = 0; i < a; i++)
       {
    	   if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];

			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];

			}
       }
       System.out.println("The Second Largest Number is "+secondLargest);    
	  
   }
}
