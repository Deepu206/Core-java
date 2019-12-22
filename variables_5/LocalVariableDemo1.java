package variables_5;

public class LocalVariableDemo1 {

	public static void main(String[] args) {
		
       int i=0;
     for (int j = 0; j < 3; j++) {
	    i=i+j;
        }
    /* System.out.println(i+"......"+j);*/    //j cannot be resolved to a variable
     
	}
	

}

