
public class Complex_part2 
{
      int real_part , imaginary_part;
      String Complex_part;
      String a = "i";
      
      public Complex_part2(int x , int y)
      {
    	  real_part = x;
    	  imaginary_part = y;
      }
      
      public void plus(Complex_part2 ch)
      {
    	  real_part = real_part + ch.real_part ;
    	  imaginary_part = imaginary_part + ch.imaginary_part ;    
    	  Complex_part = imaginary_part + a ;
    	  System.out.println();
    	  System.out.println(" ####  Addition of Two Complex Numbers  #### ");
    	  System.out.println("The value of first Complex number C1 after adding C2 is : "+real_part+"+"+Complex_part);
    	  System.out.println("The value of Second Complex number C2 is : "+ch.real_part+"+"+ch.imaginary_part+a);
      }
      
      public void multiply(Complex_part2 ch)
      {
    	  int first_part = (real_part * ch.imaginary_part) + (imaginary_part * ch.real_part) ;
    	  Complex_part = first_part + a;
    	  int second_part = (real_part * ch.real_part) - (imaginary_part * ch.imaginary_part);    
    	  System.out.println();
    	  System.out.println(" ####  Product of Two Complex Numbers  #### ");
    	  System.out.println("The Value of First Complex Number C after product with C2 is : "+second_part+"+"+Complex_part);
    	  System.out.println("The Value of Second Complex Number C2 is : "+ch.real_part+"+"+ch.imaginary_part+a);
      }
      
      public void print()
      {
    	  Complex_part = imaginary_part + a;
    	  System.out.println();
    	  System.out.println("The Complex Number is : "+real_part+"+"+Complex_part);
      }
}
