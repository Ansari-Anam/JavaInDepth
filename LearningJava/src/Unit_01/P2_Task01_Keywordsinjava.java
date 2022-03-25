package Unit_01;
/* - 50 such keywords reserved words,meanings are defined by the compiler
 * 48 +2
 * 2 are for future use
 * for future use(goto*,const*)
 * keywords can not be used as identifiers in java 
 * - object name
 * -class name
 * function name
 * -variable name
 * etc
 */

public class P2_Task01_keywordsinjava {

	public static void main(String[] args) {
       //variable name
		/*Multiple markers at this line
		- Syntax error on token "double", invalid 
		 VariableDeclaratorId*/
		int double =10;
		//function name
		double int();
      /*Multiple markers at this line
	- Syntax error on token "int", invalid AnnotationName
	- Syntax error, insert "[ ]" to complete Dimensions
	- Duplicate local variable $missing$
	- TODO Auto-generated method stub
	- Syntax error, insert "VariableDeclarators" to complete 
	 LocalVariableDeclaration*/
		//class name
		class int{
			
		};
		//Syntax error on token "int", Identifier expected
		// object name
		class ABC{};
		ABC int=10;
		/*Multiple markers at this line
		- ABC cannot be resolved to a 
		 variable
		- Syntax error on token "int", delete 
		 this token
	}*/

}
