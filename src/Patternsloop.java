
public class Patternsloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    int i;
    int j;
         for(i=1;i<=4;i++) {
    	       for(j=1;j<=i;j++){
    		System.out.print(j+ " ");
    	}
    	System.out.println(" ");
    	}
         System.out.println();
         System.out.println();
         
	int x=0;
	int y=0;
	int numb=0;
	int z=-1;
	
	for (x=1;x<=8;x+=2) {
	//	System.out.println("in this first loop");
	//	System.out.println("x:"+x+"y:"+y);
		z++;
		for (y=1;y<=x;y++) {
			numb=x-z;
		//	System.out.println("in this second loop");
		//	System.out.println("x:"+x+"y:"+y);
			System.out.print(numb+" ");
			
		}
		    System.out.println();
		
		}
	System.out.println();
	System.out.println();
	
	
	int a;
	int b;
	
	for(a=3;a<=8;a+=2) {
		for(b=1;b<=a;b++) {
			System.out.print(b+" ");
				}
	System.out.println();
	}
		
	}
	      } 
	
	  
	
	
	
		
	


