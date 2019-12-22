package variables_5;

public class StaticVariablesDemo2 {

	static String name="Divya";                         //static variable
	
	public static void main(String[] args) {            //static area start
		System.out.println("static Area:"+name);
		
		StaticVariablesDemo2 k=new StaticVariablesDemo2();
		k.display();
	}                                                   //static area ends

	
	public  void display(){                            //instance area starts    
		
		System.out.println("instance Area:"+name);
	
	}                                                  //instance area ends
}


