
public class Rectangle {

	float length, breadth, Area;
	
	public Rectangle(int a, int b)
	{
		length=a;
		breadth=b;
	}
    
	public void CalculateArea()
	{
		Area = (length*breadth);
		System.out.println(" The Area of the Rectangle = "+ Area);
	}
}
