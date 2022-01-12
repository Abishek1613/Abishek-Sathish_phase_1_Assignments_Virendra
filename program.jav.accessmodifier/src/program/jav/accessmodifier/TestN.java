package program.jav.accessmodifier;

public class TestN {
	protected long l = 77756L;
	
	public int a1 = 30;
	double d = 12.09348948;
	
	public void methodPublic(){ 
		methodPrivate();
	}
		
		protected void methodProtected(){
			methodPrivate();
		}
		
		void methodDefault(){
			methodPrivate();
		}
		 private void methodPrivate(){
			 System.out.println("Class TestN: methodProtectd");
			 System.out.println("value of protected value 1"+ 1);
			 System.out.println("Value of a1" + a1);
			 System.out.println("value of double"+d );
			 
			 
			 
		}
		

	
	}

