package variables_5;

public class StaticVariablesDemo1 {

	static String a="apple";                              //static variable
	
	public static void main(String[] args) {
		
      StaticVariablesDemo1 st= new StaticVariablesDemo1();
      System.out.println(st.a);                            //calling by using object refrence
      System.out.println(StaticVariablesDemo1.a);          //calling by using class name
      
      
	}

}
