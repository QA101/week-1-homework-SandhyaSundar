
public class PatternForLoops1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		int j;
	for (i=1;i<=4;i++) {
		for (j=1;j<=7;j++) {
			System.out.print("* ");
		}
		System.out.println();
		}
		
	System.out.println();
	int k;
	int m;
	
	for (k=1;k<=4;k++) {
	  for(m=1;m<=k;m++) {
		  System.out.print("2 ");
	  }
	  System.out.println();
	}
	System.out.println();
	System.out.println();
	
	int x;
	int y;
	
	for(x=1;x<=9;x+=2) {
	for(y=1;y<=x;y++)	{
	//	System.out.println("x:"+x+";y:"+y+";x/7:"+x/7+"z1:"+z1);
	//    System.out.println("in the second for loop"); 
		System.out.print("$ ");
	}
		 System.out.println();
	 }
	System.out.println();
	System.out.println();
	
	int a;

	for(a=2;a<=9;a+=2) {
	for(int b=1;b<=a;b++)	{
	//	System.out.println("x:"+x+";y:"+y+";x/7:"+x/7+"z1:"+z1);
	//    System.out.println("in the second for loop"); 
		System.out.print("* ");
	}
		 System.out.println();
	 		
	}	
	System.out.println();
	System.out.println();
	
     int p;
     int q;
     int num=1;
     for(p=1;p<=4;p++) {
    	 num=1;
    	 for(q=1;q<=p;q++) {
    		 System.out.print(num+" ");
    		 num++;
    	 }
    	 System.out.println();
    	     		
	}
	
	
	}	
}

