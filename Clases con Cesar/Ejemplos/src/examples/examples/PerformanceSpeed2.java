package examples.examples;

public class PerformanceSpeed2 {

  public static void main(String[] args) {
	long startingTime = System.currentTimeMillis();
	// String test
	startingTime = System.currentTimeMillis();
    String string = new String("Hello");
	
    for (int i = 0; i < 1000000; i++) {
      string.concat(" world");
    }
	
    System.out.println("Time consumed by String: " + (System.currentTimeMillis() - startingTime) + " milliseconds");
	
	// StringBuffer test
    startingTime = System.currentTimeMillis();
    StringBuffer sbuffer = new StringBuffer("Hello");
	
    for (int i = 0; i < 1000000; i++) {
      sbuffer.append(" world");
    }
	
    System.out.println("Time consumed by StringBuffer: " + (System.currentTimeMillis() - startingTime) + " milliseconds");
	
	// StringBuilder test
    startingTime = System.currentTimeMillis();
    StringBuilder sbuilder = new StringBuilder("Hello");
	
    for (int i = 0; i < 1000000; i++) {
      sbuilder.append(" world");
    }
	
    System.out.println("Time consumed by StringBuilder: " + (System.currentTimeMillis() - startingTime) + " milliseconds");
  }
}