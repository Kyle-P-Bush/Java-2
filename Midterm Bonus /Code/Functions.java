

public class Functions{
	
	//test and refactor to make function01 correct
	public static String function01(int x, int y, int z){
		if(ifZero(x, y, z)){
			return "Invalid numbers: Cannot input 0 for any value.";
		}else{
			double value = ( (x / y) +  ( Math.sqrt(Math.pow(x,2) ) ) - y )/ (2 * x * z);
			String answer = String.format("%.3f", value);
			return answer;
		}
	}

	public static boolean ifZero(int x, int y, int z){
		if(x == 0 || y == 0 || z == 0){
			return true;
		}else{
			return false;
		}
	}
	
	
}