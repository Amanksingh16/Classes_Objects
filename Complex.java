
public class Complex {
     int real_part , imaginary_part;
     String complex_part;
     String a = "i";
     public Complex(int a1) 
     {
    	 real_part = a1;
     }
     
     public void Display(Complex ch)
     {
    	 real_part = real_part + ch.real_part ;
    	 System.out.println(real_part);
     }
}
