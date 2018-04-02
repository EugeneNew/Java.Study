package ExceptionPackage;

 public class ExceptionThrowsExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  try{	
        ThrowsDemo.throwOne();
	  }
	  catch( IllegalAccessException e){
		  System.out.println("Перехвачено исключение" + e);
	  }
	}

}
 