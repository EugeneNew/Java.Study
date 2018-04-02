package ExceptionPackage;

 class ThrowsDemo {
	 static void throwOne() throws IllegalAccessException{
		 System.out.println("B теле метода throwOne().");
		 throw new  IllegalAccessException("Демонстрация.");
		 
	 }
}
