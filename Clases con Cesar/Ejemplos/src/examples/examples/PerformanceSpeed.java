package examples.examples;

public class PerformanceSpeed {

  public static void main(String[] args) {
	long startingTime = System.currentTimeMillis();
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