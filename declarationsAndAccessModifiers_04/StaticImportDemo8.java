package declarationsAndAccessModifiers_04;

//import static java.lang.Integer.MAX_VALUE;  //Line 2 ...127  
import static java.lang.Byte.*;
public class StaticImportDemo8 {
	
	/*static int MAX_VALUE=999; */ // Line 1
	
	public static void main(String[] args) {
		
		System.out.println(MAX_VALUE);  
		
 // when line 1 is commented  o/p:2147483647(no static variables in the class so next priority given to explicit )
 // when line 1&2 are commented then o/p:127 (since one implicit import is there)
		
	}

}

