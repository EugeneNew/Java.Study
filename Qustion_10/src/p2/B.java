//in file B.java
package p2;
//import p1.*;

import p1.*;
//import p1.C;

public class B extends A{
/*  public int getJ(A a){
		return a.j;
  }*/
  public int getI(A a){
		return a.i;
  }
  public void process(A a) {
    a.i = a.i*2;
  }
  public static void main(String[] args) {
    A a = new B();
    B b = new B();
    b.process(a);
    
//    System.out.println("b.getJ()="+b.getJ());
    
    C c = new C(99);
    
    System.out.println("c.getG()="+c.getG());
    System.out.println("c.getJ()="+c.getAJ(a));
    
    System.out.println( a.getI() );
  }
}