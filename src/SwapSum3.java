
public class SwapSum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=5;
		int z=12;
		int temp=0;
		
	System.out.println("Before Swapping");
	System.out.println("Value of x= "+x);
	System.out.println("Value of y= "+y);
	System.out.println("Value of z= "+z);
		
		temp=z;
		z=y;
		y=x;
		x=temp;
	System.out.println();
	System.out.println("After Swapping");
	System.out.println("Value of x= "+x);
	System.out.println("Value of y= "+y);
	System.out.println("Value of z= "+z);
	}

}
