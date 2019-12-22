package declarationsAndAccessModifiers_04;

import java.util.ArrayList;

public class ImportStatementDemo1 {

	public static void main(String[] args) {
		
		//before import
		
     /*ArrayList l=new ArrayList();*/        /*c.e:ArrayList cannot be resolved to a type
	                                               ArrayList cannot be resolved to a type*/
     
     // usage of fully qualified name
		
    /* java.util.ArrayList l=new java.util.ArrayList();*/
     
     //after importing 
		
		ArrayList l=new ArrayList();
		    
	}

}
