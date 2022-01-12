package program.jav.accessmodifier;

public class TestM {
	
	private int a = 30;
	
	long b = 2000;
	
	protected float c = 45.98f;
	
	public void methodPublic(){ 
		methodPrivate();
		}
	
	protected void methodProtected(){
		methodPrivate();
	}
	
	void methodDefault(){
		methodPrivate();
	}
	private void methodPrivate(){  //private method
	System.out.println("Class TestM: methodProtected");
	System.out.println("value of protected value c "+ c);
	System.out.println("value of private value a"+ c);
	System.out.println("value of long"+ b);
	}
}



