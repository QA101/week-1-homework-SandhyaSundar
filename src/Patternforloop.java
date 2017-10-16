
public class  Patternforloop{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		int j;
		
		for(i=1;i<=4;i++) {
			for(j=1;j<=i+1;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
	}
		System.out.println();
		
		int n;
		int m;
		
	for(n=1;n<=4;n++) {
		for (m=1;m<=n;m++) {
			System.out.print("2 ");
		}
		System.out.println();
	}
	System.out.println();
	System.out.println();
	
	 	
	for (int a1=1;a1<7;a1+=2) {
		for(int b1= 0;b1<(4 - a1/2);b1++) {
			System.out.print(" ");
		}
	for (int c1=0;c1<a1;c1++) {
		System.out.print("*");
	}
	System.out.println("");
	
	}
	
	    
	}
	
}
	
	


