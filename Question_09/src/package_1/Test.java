package package_1;

class Super { static String ID = "QBANK"; }
class Sub extends Super{
  static { System.out.print("In Sub"); }
}
class Test{
  public static void main(String[] args) {
    System.out.println(Sub.ID);
    Sub sub = new Sub();
//    System.out.println(sub.); 		
    
  }
}