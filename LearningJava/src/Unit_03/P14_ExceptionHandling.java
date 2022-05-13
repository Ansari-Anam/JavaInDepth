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
 * //throws isliye likha kyuki vo khud handle nahi kr skta... if method(lazy method) tells i can't handle then it specifies to handle it as the exception would come ahead
		
			//throw keyword is used in java to explicitly throw an exception from a method or any block of code
			//we can either throw checked or unchecked exception
			//the throw keyword is mainly used to throw custom exception
			 *  The Exception Handling in Java is one of the powerful mechanism to handle 
 * the runtime errors so that the normal flow of the application can be maintained.
 * 
 * Exception Handling is a mechanism to handle runtime errors 
 * such as ClassNotFoundException, IOException, SQLException, RemoteException, etc.
 * 
 * Advantage of Exception Handling
 *-The core advantage of exception handling is to maintain the normal flow of the application.
 *-An exception normally disrupts the normal flow of the application; that is why we need to handle exceptions.
 *
 *There are mainly two types of exceptions: checked and unchecked. 
 *An error is considered as the unchecked exception. 
 *However, according to Oracle, there are three types of exceptions namely:
 *1.Checked Exception:
 *-The classes that directly inherit the Throwable class except RuntimeException and Error are known as checked exceptions. 
 *-For example, IOException, SQLException, etc.
 *-Checked exceptions are checked at compile-time.
 *
 *2.Unchecked Exception:
 *-The classes that inherit the RuntimeException are known as unchecked exceptions. 
 *-For example, ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc. 
 *-Unchecked exceptions are not checked at compile-time, but they are checked at runtime.
 *
 *3.Error:
 *-Error is irrecoverable. Some example of errors are OutOfMemoryError, VirtualMachineError, AssertionError etc.
 *-Errors cannot be handled
 *-for example when stackOverFlow occurs we can not handle it as memory can not be increased
 *
 *
 *Java Exception Keywords::
 *
 *-Java provides five keywords that are used to handle the exception. The following table describes each.
 **Keyword	Description
 *
 *-try	    The "try" keyword is used to specify a block where we should place an exception code. 
 *			It means we can't use try block alone. The try block must be followed by either catch or finally.
 *
 *-catch	The "catch" block is used to handle the exception. 
 *			It must be preceded by try block which means we can't use catch block alone. It can be followed by finally block later.
 *
 *-finally	The "finally" block is used to execute the necessary code of the program. 
 *			It is executed whether an exception is handled or not.
 *
 *-throw	The "throw" keyword is used to throw an exception.
 *
 *-throws	The "throws" keyword is used to declare exceptions. 
 *			It specifies that there may occur an exception in the method. 
 *			It doesn't throw an exception. It is always used with method signature.
 */

public class P14_ExceptionHandling {
	public static void main(String[] args)
	{
		abc obj= new abc(); // from object(reference) we can call methods of class
		//obj.basicException();
		obj.handleException();
		obj.multiplecatch();
		obj.inputMismatchException();
		//obj.StackOverFlowError();
		obj.indexOutOfBoundExceptionPart1();
		obj.indexOutOfBoundPart2();
		obj.nullPointerException();
		obj.useOfThrow(12);
		obj.useOfFinally();
		obj.checkedAndUnchecked();
		//obj.usingMyExeption(-7);
			
				
				System.out.println("Program Done!");
	}
class abc{
		void basicException() {
			// Arithmetic Exception
			// Compiler cannot catch this exception at compile time  
			int b=0;
			int a=10/b;     // code break at this line
			System.out.println(a);
	
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
				System.out.println(e.getMessage());// getmessage() is a funtion of exception class
				System.out.println("Done!");
			}
		}
		void multiplecatch()
		{
			/*
			 * at a time only one exception occurs and at a time only one catch block is executed
			 * all catch blocks must be ordered from most specific to most general
			 * i.e catch for Arithmetic Exception must come before catch   for exception
			 * */
			
			 try
			 {    
	             int a[]=new int[5];    
	             a[5]=30/7;    
	         }    
	         catch(ArithmeticException e)  
	         {  
	                System.out.println("Arithmetic Exception occurs");  
	         }    
	         catch(ArrayIndexOutOfBoundsException e)  
	         { 
	        	 //this catch block will be executed
	                System.out.println("ArrayIndexOutOfBounds Exception occurs");  
	         }    
	         catch(Exception e)  
	         {  
	                System.out.println("Parent Exception occurs");  
	         }          
			 System.out.println("Done!"); 
				
		}
		
		void inputMismatchException()
		{
			//It occurs when wrong type input is given by user
			//It is imported from java.util.InputMismatchException; 
			try
			{
				
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter a number:");
				int a =0;
				a= scan.nextInt();
				
				System.out.println("Entered number is:"+a);
				scan.close();
			}
			catch(InputMismatchException e)
			{
				System.out.println("InputMismatchException handled");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println("Done!");
			
		}
		void StackOverFlowError(int i)
		{
			//StackOverFlowError cannot be handled
			//as it is error not exception
			
			//it is error as if memory is full, memory can not be extended 
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
			// index out of bound with exception handling
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
			try
			{
				String str=null; // string assigned with null cannot be given a memory in stack
				System.out.println(str.length());
			}
			catch(NullPointerException e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println("Done!"); 
				
			
		}
		void useOfThrow(int age) 
		{
			//throw keyword is used in java to explicitly throw an exception from a method or any block of code
			//we can either throw checked or unchecked exception
			//the throw keyword is mainly used to throw custom exception
			try
			{

				if(age<18)
				{
					throw new ArithmeticException("Use of Throw");

					//this error must be handled by caller method
					//pointed by throws
				}
				else
				{
					System.out.println("You are allowed");
				}
			}
			catch(ArithmeticException e)
			{
				System.out.println(e.getMessage());
			}
				
			
			
			System.out.println("Done!");
		}
		
		void useOfThrows(int age) throws Exception
		{
			//throws is a keyword in java which is used in the signature 
			//of method to indicated that this method might throw one of the listed type exceptions
							
							/*
							 * we can use throws keyword to delegate the responsibility of 
							 * exception handling to the caller then caller method is responsible to handle that exception
							 * 
							 * syntax:
							 * type method_name(parameters) throws exception_list
							 */
			
				if(age<18)
				{
					throw new Exception("Use of Throws");

					//this error must be handled by caller method
					//pointed by throws
				}
				else
				{
					System.out.println("You are allowed");
				}
				
			
			
			System.out.println("Done!");
		}
		
		void useOfFinally() 
		{
			
			
			
			/*
			 * finally	The "finally" block is used to execute the necessary code of the program. 
			 *It is executed whether an exception is handled or not.
			 */
			
			try
			{
				
				useOfThrows(12);
				
				//we can not use it without try block as it throws checked exception
				//so compiler enforce use to handle it
				//if it would have thrown ArithmeticException then it can be called without try
				//as it is a unchecked exception
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			finally  // finally=always run....it closes everything (for code segmentation)
			{
				System.out.println("Done!!!: The try catch is finished");
				//executed whether exception occurs or not
			}
			

		}
		
		
				
		
		void checkedAndUnchecked() {
			/*
			 *There are mainly two types of exceptions: checked and unchecked. 
			 *An error is considered as the unchecked exception. 
			 *However, according to Oracle, there are three types of exceptions namely:
			
			 *1.Checked Exception:
			 *-The classes that directly inherit the Throwable class except RuntimeException and Error are known as checked exceptions. 
			 *-For example, IOException, SQLException, etc.
			 *-Checked exceptions are checked at compile-time.
			 *
			 *2.Unchecked Exception:
			 *-The classes that inherit the RuntimeException are known as unchecked exceptions. 
			 *-For example, ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc. 
			 *-Unchecked exceptions are not checked at compile-time, but they are checked at runtime.
			 *
			 *3.Error:
			 *-Error is irrecoverable. Some example of errors are OutOfMemoryError, VirtualMachineError, AssertionError etc.
			 *-Errors cannot be handled
			 *-for example when stackOverFlow occurs we can not handle it as memory can not be increased
			 *
			 */
			
			try
			{
				
				useOfThrow(12);
				
				//checked Exception
				
				//we can not use it without try block as it throws checked exception
				//so compiler enforce use to handle it
				//if it would have thrown ArithmeticException then it can be called without try
				//as it is a unchecked exception
			}
			catch(Exception e)
			{
				System.out.println("checked Exception");
			}
			
			try
			{
				int b=0;
				int a=5/b;                          //code breaks at this line and exception is thrown
				System.out.println("5/0="+a);
				//unchecked Exception
			}
			catch(ArithmeticException e)
			{
				//Thrown when an exceptional arithmetic condition has occurred.
				//For example, an integer "divide by zero" throws an instance of this class
				
				//catch the occurred exception
				
			
				System.out.println("unchecked Exception");
				
				
			}
			System.out.println("Done!");
			void usingMyExeption(int a)
			{
				try
				{
					if(a<0)
					{
						throw new MyException();
					}
					else
					{
						System.out.println(a+"is positive");
					}
				}
				catch(MyException e)
				{
					System.out.println(e.getMessage());
				}
			}
			

		}

		//making own exception

		class MyException extends Exception
		{
			//to create our own exception our class should extend Exception Class
			public String getMessage()
			{
				
				//we can override getMessage method of Exception Class
				return "MyException Occured";
			}
		}

	}}
}
