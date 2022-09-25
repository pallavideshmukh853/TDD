package tddbinary;

public class BinalyEquant {

public String findBinaryEquant(int num) {
		
		int temp=num,rem;
		String binary="";
		rem=temp%2;
		binary+=Integer.toBinaryString(num);
		return binary;
	}
}
