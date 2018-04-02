package package_01;

import java.util.LinkedList;

class Address{
	private String name;
	private String street;
	private String city;
	private String state;
	private String code;
	
	Address(String n,String s, String c,String st,String cd){
		name = n;
		street = s;
		city = c;
		state = st;
		code = cd;
    }
	
	public String toString(){
		return name + "\n" + street + "\n" + city + " " +	state + " " +	code;
	}
	
}


public class MailList {

	public static void main(String[] args) {
		
		LinkedList<Address> ml = new LinkedList<Address>();
		
		ml.add(new Address("J.W.West","11OakAve","Urbana","IL","б1801"));
		ml.add(new Address("RalphBaker","1142MapleLane","Mahomet","IL","61853"));
		ml.add(new Address("TomCarlton","867ElmSt","Champaign","IL","61820"));
		
		for(Address element:ml){
		 System.out.println(element + "\n ");
		}
		
		
		

	}

}
