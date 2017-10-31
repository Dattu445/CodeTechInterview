package Com.java;

public class Pascal {
	
	public static void PrintPascalTraingle(int rows) {
	       for (int i = 0; i < rows; i++) {
	           for (int j = 0; j <= i; j++) {
	               System.out.print(pascalCalc(i, j) + " ");
	           }
	           System.out.println();
	       }
	   }
	
	public static int pascalCalc(int i, int j) {
	    if (j==0 || j==i )
	    	return 1;
	    else
	    	return pascalCalc(i-1,j-1) + pascalCalc(i-1,j);
	}
	
	public static void main(String[] args){
		Pascal.PrintPascalTraingle(64);
	}
}
	
