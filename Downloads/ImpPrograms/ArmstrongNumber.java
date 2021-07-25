
public class ArmstrongNumber {
	
	
public static boolean armstrongno(int num) {	
	int result = 0;	
	boolean check=false;
	int orignianlno = num;
	while(num!=0) {
		  int remainder = num%10;
		  result = (int) (result+ Math.pow(remainder, 3));
		  num = num/10;
	}
	if(orignianlno== result) {
		check = true;
	}
	
	return check;
}

public static void main(String[] args) {
	
	System.out.println(armstrongno(153));
}
}
