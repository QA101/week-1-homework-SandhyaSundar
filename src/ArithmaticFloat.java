
public class ArithmaticFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x=25.75;
		double y=17.34;
		
		double sum =x+y;
		System.out.print("Sum :" +sum);
		System.out.println();
		
		double difference =x-y;
		System.out.print("Difference :"+ difference);
		System.out.println();
		 
		double multiple=x*y;
		System.out.print("Multiple :"+ multiple);
		System.out.println();
		
		double division= x/y;
		System.out.print("Division :"+ (int) division);
		
		System.out.println();
		System.out.println();
		if (x>y) {
			System.out.println("true.x is greater.");
		}
			else if (x<y){
				System.out.println("False.x is not greater");
		}
		
	}

}
