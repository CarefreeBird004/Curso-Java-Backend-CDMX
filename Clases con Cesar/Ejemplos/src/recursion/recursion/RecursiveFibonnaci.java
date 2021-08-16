package recursion.recursion;

public class RecursiveFibonnaci {

  public static void main (String args[]) {
    for(long i=0; i<=10; i++){ 
		System.out.print(fibonacci(i) +" "); 
    }
	
    System.out.println();
  }


  /* A recursive Fibonnaci sequence in Java program */
  public static long fibonacci(long number) {
    if (number == 0) {
		return 0;
	} else if (number == 1 || number == 2) {
		return 1;
    }
	
    return fibonacci(number - 1) + fibonacci(number - 2);
  }
}