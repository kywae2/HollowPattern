

public class StarPattern {

	public static void main(String[] args) {
		
		/*
		 * int i,j,k; for(i=1; i<=5; i++) {
		 * 
		 * for (j=4; j>=1; j--) { System.out.print(""); }
		 * 
		 * 
		 * for (k=1; k<=(2*i-1); k++) { if(k==1 || k == (2*i-1)) {
		 * System.out.print("*"); }else if(i==5) { System.out.print("*"); }else {
		 * System.out.print(" "); }
		 * 
		 * }
		 * 
		 * System.out.println(" "); }
		 */
		
		
		/*
		 * for (int i = 1; i <= 5; i++) { for (int j = 1; j <= i; j++) {
		 * System.out.print("*"); }
		 * 
		 * System.out.println(""); }
		 * 
		 * 
		 * for(int i=1; i<=4; i++) { for(int j=4; j>=i; j--) { System.out.print("*"); }
		 * 
		 * System.out.println(""); }
		 */
		
		/*
		 * for(int i = 1; i<=4 ; i++) { for(int j = 4; j >= i; j-- ) {
		 * System.out.print(" "); }
		 * 
		 * for(int k=1; k<=i; k++) { System.out.print("*"); }
		 * 
		 * System.out.println(""); }
		 */
		
		/*
		 * for (int i = 1; i<=4; i++) { for(int j=1; j<=i; j++) { System.out.print(" ");
		 * }
		 * 
		 * for(int k=4; k>=i; k--) { System.out.print("*"); } System.out.println(""); }
		 */
		
		for(int i=1; i<=4; i++) {
			for(int j=4; j>=i ; j--) {
				System.out.print(" ");
			}
			
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			
			for(int k=4; k>=i; k--) {
				System.out.print("*");
			}
			
			System.out.println("");
		}

	}

}
