
public class doIt{
	
 public static void main(String[] str) { //1
 // str = {"1","2","34"};
  int i = 10;
  i : for (int k = 0 ; k< 10; k++) { //2
    System.out.println( str[k] + i); //3
    if( k*k > 10) continue i; //4 
  }
 }
}