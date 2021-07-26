
public class Triangle {
	
	public static void triangle() {
	int rows = 6;
	
	for(int i =1;i<=rows;i++) {
		
		for(int j=i;j<rows;j++ ) {
			System.out.print(" ");
		}
		

		for(int k=1;k<i*2;k++ ) {
			System.out.print("*");
		}
		System.out.println("\n");
		
	}
	}
	public static void main(String[] args) {
		triangle();
	}
}
