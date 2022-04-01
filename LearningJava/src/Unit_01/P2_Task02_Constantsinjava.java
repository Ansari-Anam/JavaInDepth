package Unit_01;

/* Constants in java
 * -piece of code that would never change 
 * - Constants never change once a value is assigned
 * Declaration syntax: const(keyword) data type variable name;
 */
public class P2_Task02_Constantsinjava {
	public static final double Pi=3.14;
	public static void main(String[] args) {
		System.out.println(Pi);
		main("Calling the program");
		
		NewClass obj=new NewClass();
		obj.add(1,2);
		System.out.println(obj.Pi);
		
	}
	
	public static void main(String args)
	{
		System.out.println(Pi);
	}
	void add(int a,int b)
	{
		System.out.println(a+b);
		System.out.println(Pi);
	}

}
class NewClass{
	int add(int a, int b) {
		System.out.println(a+b);
		System.out.println(P2_Task02_Constantsinjava.Pi);
		}}
	}
	}
}