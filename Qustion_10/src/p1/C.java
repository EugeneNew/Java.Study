package p1;

public class C extends A{
	int g;
	
	public C(int f){
		g = f;
	}
	
	
	public int getJ(){
		return j;
	}
	
	public int getAJ(A a){
		return a.j;
	}
	
	public int getG(){
		return g;
	}
	public void process(A a) {
		    a.i = a.i*2;
    }
}
