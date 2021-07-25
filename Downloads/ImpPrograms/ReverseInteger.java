
public class ReverseInteger {
	
	public static int reverseInteger(int num) {
		
		int result = 0;
		while(num!=0) {
			  result = result*10+ num%10;
			 num = num/10;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(reverseInteger(12345));
	}
}
