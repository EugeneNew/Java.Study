class Stats<T extends Number>{
	T[] nums;

  Stats(T[] o){
	  nums =  o;
  }
  
  double average(){
	  Double sum = 0.0;
	  for(int i=0;i<nums.length;i++){
		  sum += nums[i].doubleValue();
	  }
	  return sum/nums.length;
  }
  
  
}



public class BoundsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	   Integer inums[] = {1,2,3,4,5};
       Stats<Integer> iob = new Stats<Integer>(inums);
       double v = iob.average();
       System.out.println("Среднне значение v = " + v);
       
       Double dnums[] = {1.1,2.2,3.3,4.4,5.5};
       Stats<Double> dob = new Stats<Double>(dnums);
       double w  = dob.average();
       System.out.println("Среднее значение w = " + w);
       
/*       String snums[] = {"1","2","3","4","5"};
       Stats<String> sob = new Stats<String>(snums);
       double x  = dob.average();
       System.out.println("Среднее значение w = " + w);
       */
       
       
       
	}

}
