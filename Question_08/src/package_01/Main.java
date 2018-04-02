package package_01;

public class Main {
	  static void method(int... a) {
	    System.out.println("inside int...");
	  }
	  
	  static void method(int a, int b) {
		    System.out.println("inside int");
		  }
	  static void method(long a, long b) {
	    System.out.println("inside long");
	  }
	  static void method(Integer a, Integer b) {
	    System.out.println("inside INTEGER");
	  } 
	  
	  
	  public static void main(String[] args) {
	    long a = 2;
	    long b = 3;
	    int c = 4;
	    method(a,b);
	  }
	}
