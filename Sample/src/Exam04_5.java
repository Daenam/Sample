public class Exam04_5 {
	public static void main(String[] args) {
		//���� ���� Ctr1 +D
		int space =0;
		for(int row = 1; row <=5; row++) {
			space = 5 - row;
			for(int col = 1; col <=5; col++) {
				if(space >= col) {
					System.out.println(" ");
				} else {
	 	    	System.out.println("@");
		 	}
		  	    System.out.println();
	  	 }
	   }		
    }	  
		


