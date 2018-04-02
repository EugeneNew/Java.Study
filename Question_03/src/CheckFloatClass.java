
public class CheckFloatClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Float f1 = new Float(Float.NaN);
		Float f2 = new Float(Float.NaN);
		System.out.println( ""+ (f1 == f2)+" "+f1.equals(f2)+ " "+(Float.NaN == Float.NaN) );
		
		
		
		
		
		Double a = new Double(Double.NaN);
	    Double b = new Double(Double.NaN);
	   
	    if( Double.NaN == Double.NaN )
	      System.out.println("True");
	    else
	      System.out.println("False");
	    	
	    if( a.equals(b) )
	      System.out.println("True");
	    else
	      System.out.println("False");

	}

}
