public class Calculator{
	
	public static int add(int x, int y){
		return x+y;
	}
	
	public static double add(double x, double y){
		return x+y;
	}
	
	public static int subtract(int x, int y){
		return x-y;
	}
	
	public static double subtract(double x, double y){
		return x-y;
	}
	
	public static int multiply(int x, int y){
		return x*y;
	}
	
	public static double multiply(double x, double y){
		return x * y;
	}
	
	public static int divide(int x, int y){
		return x/y;
	}
	
	public static double divide(double x, double y){
		return x/y;
	}
	
	public static int factorial(int x){
		int value = x;
		for(int i = x - 1; i > 0; i--){
			value *= i;
		}
		return value;
	}
	//nCr
	public static int combination(int n, int r){
		return (factorial(n) / factorial(r) * factorial(n-r));
	}
	
	public static int permutation(int n, int r){
		return factorial(n) / factorial(n-r);
	}

	public static String[] quadratic(double a, double b, double c){
		String[] answers = new String[2];
		double real = (-b/(2*a));
		double complex = sqrt(a,b,c) / (2*a);
		if(quadraticIsComplex(a, b, c)){
			answers[0] = String.format("%.3f + %.3fi", real, complex);
			answers[1] = String.format("%.3f - %.3fi", real, complex);
		}else{
			answers[0] = String.format("%.3f", (real+complex));
			answers[1] = String.format("%.3f", (real-complex));
		}
		return answers;
	}

	private static double sqrt(double a, double b, double c){
		return Math.sqrt(Math.abs(b*b - 4*a*c));
	}

	private static boolean quadraticIsComplex(double a, double b, double c){
		return (b*b - 4*a*c) < 0;
	}

	// public static double[] quadratic(double a, double b, double c){
	// 	double[] answers = new double[2];
	// 	answers[0] = (-b + Math.sqrt(b*b - 4*a*c)) / (2*a);
	// 	answers[1] = (-b - Math.sqrt(b*b - 4*a*c)) / (2*a);
	// 	return answers;
	// }


	public static double mean(int[] values){
		int sum = 0;
		for(int value : values){
			sum += value;
		}
		return (double)sum/values.length;
	}
	
	public static double variance(int[] values){
		double mean = mean(values);
		double sum = 0;
		for(int i = 0; i < values.length; i++){
			double k = values[i] - mean;
			sum += k*k;
		}
		return sum / values.length;
	}
	
	public static double standardDeviation(int[] values){
		return Math.sqrt(variance(values));
	}
}