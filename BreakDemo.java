
import java.util.Scanner;


public class BreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 2,4,8,16,32,64,128,256,1000,45};
		
		Scanner Scan = new Scanner ( System.in);
		
		System.out.println(" Please Enter the Element To be Searched ");
		
		int target = Scan.nextInt();
		
		for ( int i=0;i<=10;i++) {
			if  (arr[i]==target) {
				
				System.out.println ( " Element Found");
				break;
				
			} 
			
			
			}
			
		}
		
	}


