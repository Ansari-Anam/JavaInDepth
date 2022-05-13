package Unit_03;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * obj.basicException()
 * obj.handleException()
 * obj.multiplecatch()
 * obj.inputMismatchException()
 * obj.StackOverFlowError()
 * obj.indexOutOfBoundException()
 * obj.nullPointerException()
 * obj.useOfThrow()
 * obj.useOfThrowAndFinally()
 * obj.checkedAndUnchecked()
 * catch= exception handler
 * exception=it handles programatically exceptions 
 * string pool
 * checked exception= when the compiler knows exception will come and it force u to do try and catch(compiletime exception)
 * unchecked exception= when the compiler do not knows the exception would come (runtime exception)
 * throws= it passes the error to next method for further handling
 * Exception(class)=which breaks the execution of program
 */

public class P14_ExceptionHandling {
	class abc{
		void basicException() {
			int b=0;
			int a=10/b;
			System.out.println(a);
			System.out.println("Done!");
	}
		void handleException()
		{
			try {
				//sensitive code 
				int b=0; 
				int a = 100/b;
				System.out.println(a);
			} catch(ArithmeticException e)
			{
				System.out.println(e.getMessage());
				System.out.println("Done!");
			}
		}
		void multiplecatch()
		{
			try {
				int b=0;
				int a=10/b;
				System.out.println(a);
			}//child class exception came first 
			catch (ArithmeticException e) {
				System.out.println(e.getMessage() + " Arithmeetic!!!!");
				System.out.println("Done!");
			}catch(Exception e) {
				System.out.println(e.getMessage() + " exception!!");
			}
		}
		void inputMismatchException()
		{
			try {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the number:");
			    int number=sc.nextInt();
			    System.out.println("You entered:" + number);
			} catch (InputMismatchException e) {
				System.out.println(e + " Resolved");
			}
			
			System.out.println("Done!!!!!");
			
		}
		void StackOverFlowError(int i)
		{
			try{
				while(i>0)
			{
				i++;
				StackOverFlowError(i);
			}
				}catch(Exception e)
			{
					////this is error can't resolved because it is not an exception
					System.out.println(e.getMessage());   //Sysout+ctrl+space
			}
			
			//Rest of the code
			System.out.println("Done!");
			
		}
		void indexOutOfBoundExceptionPart1()
		{
			
					int[] num= {1,2,3,4};
					System.out.println(num[10]);
		
		}
		void indexOutOfBoundPart2()
		{
			try {
				int[] num= {1,2,3,4};
				System.out.println(num[10]);
			} catch (IndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
			  System.out.println("Done!!");
		}
		void nullPointerException()
		{
			try{
				String s="null"; // string assigned with null cannot be given a memory in stack
				System.out.println();
			}catch(Exception e)
			{
				System.out.println("cannot handle null exception");
			}
			
		}
		void useOfThrow(int age) throws Exception //throws isliye likha kyuki vo khud handle nahi kr skta... if method(lazy method) tells i can't handle then it specifies to handle it as the exception would come ahead
		{
			if(age < 18)    //for manual exception we uses throw keyword or for forcing compiler to handle our exception			{
				throw new Exception();  // creating object of Exception class
			}
		else
			{
				System.out.println("You are allowed to enter ");
			}
		}
		void useOfThrowAndFinally() // finally=always run....it closes everything (for code segmentation)
		{
			try {
				useOfThrow(17);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			finally {
				System.out.println("hieyu");
			}
			
		}
		void checkedAndUnchecked() {
			
		}
		
		
	public static void main(String[] args)
	{
		abc obj= new abc(); // from object(reference) we can call methods of class
		obj.basicException();
		obj.handleException();
		obj.multiplecatch();
		obj.inputMismatchException();
		obj.StackOverFlowError();
		obj.indexOutOfBoundExceptionPart1();
		obj.indexOutOfBoundPart2();
		obj.nullPointerException();
		obj.useOfThrow();
		obj.useOfThrowAndFinally();
		obj.checkedAndUnchecked();
	}

	}
