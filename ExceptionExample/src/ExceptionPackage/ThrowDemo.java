package ExceptionPackage;

 class ThrowDemo {
	static void demoproc(){
		try{
			throw new NullPointerException("Демонстрация");
		   }
		catch(NullPointerException e){
		   System.out.println("Исключение перехвачено в теле метода DemoProc()");
		   throw e; //повторно сгенерировать исключение
		}
	}

}
