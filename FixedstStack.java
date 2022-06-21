package Imnterfacetest;


public class FixedstStack  implements IntStack{
private int stck[];
private int tos;
public FixedstStack(int size) {
	stck =new int[size];
	tos =-1;
}
	@Override
	public void push(int item) {
	 if (tos==stck.length-1)
		 System.out.println("stack is full");
	 else 
		 stck [++tos]=item;
	 
		
	}

	@Override
	public int pop() {
		if (tos<0) { 
			System.out.println("stack underflow.");	
		return 0;
	                }
     else
		return stck[tos--];
		
	}

}
class IfTest{
public static void main(String[] args) {
	FixedstStack myStack1= new FixedstStack(5);
	FixedstStack myStack2 = new FixedstStack(8);
	for (int i = 0; i < 5; i++) myStack1.push(i);
	for (int i = 0; i < 5; i++) myStack2.push(i);
	System.out.println("stack in mystack1: ");
	for (int i = 0; i < 5; i++)
		System.out.println(myStack1.pop());
	System.out.println("stack in mystack2 : ");
	for (int i = 0; i < 5; i++)
		System.out.println(myStack2.pop());
	

	
}
	
}

