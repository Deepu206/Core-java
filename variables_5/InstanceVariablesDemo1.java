package variables_5;

public class InstanceVariablesDemo1 {

	int x=1;                                       //inatance varible
	
	public static void main(String[] args) {
		
    /*System.out.println(x); */                     //c.e = Cannot make a static reference to the non-static field x
    
    InstanceVariablesDemo1 i=new InstanceVariablesDemo1();
    System.out.println(i.x);
    i.display();
   	
	}
                                                   //inatance method	
public void display(){                        
	System.out.println("Instance method......");
}
}
