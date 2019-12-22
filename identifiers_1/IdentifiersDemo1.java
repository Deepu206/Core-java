package identifiers_1;

public class IdentifiersDemo1 {

	public static void main(String[] args) {
		
		// allowed characters are A-Z,a-z,0-9,_,$....case sensitive****************
		
		String FRUIT="Apple1";
		String fruit="Banana2";
		String fruIt0="Orange3";
		String frUi_t="guva4";
		String frUi$T="grapes5";
		
		System.out.println(FRUIT+"...."+ fruit+"...."+fruIt0+"....."+frUi_t+"...."+frUi$T);
		
		//can't start with digit*****************************************************
		
		/*String 1ap="Andhra";*/ //c.e=Syntax error on token "1", delete this token
		String ap1="Andhra Pradesh";
		
		System.out.println(ap1);
		
		//predefined classes&interfaces names****************************************
		
		int String=11;//string is a predefined class
		int  Runnable=111;//string is a predefined interface
		System.out.println(String+"....."+Runnable);
		
		//reserved words can't use 
		
		/*int if=0;  */        //c.e=Syntax error on token "if", invalid VariableDeclaratorId
		
			
		
		
		
	}

}
