package ExceptionPackage;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try{
		ThrowDemo.demoproc();
	}
	catch(NullPointerException e){
		System.out.println("Повторный перехват исключения:" + e);
	}
		
	}

}
