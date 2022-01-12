package program.jav.accessmodifier;

public class TestP {
	public static void main(String args[]){
		new TestM().methodPublic();
		new TestM().methodProtected();
		new TestM().methodDefault();
		new TestN().methodPublic();
		new TestN().methodProtected();
		new TestN().methodDefault();
		System.out.println("value of long"+ new TestM().b);
	}
	public void methodPublic(){
		System.out.println("Class TestM: methodPublic");
		System.out.println("Class TestN: methodPublic");
	}
	protected void methodProtected(){
		System.out.println("Class TestM: methodProtected");
		System.out.println("Class TestN: methodProtected");
	}
	void methodDefault(){
		System.out.println("Class TestM: methodDefault");
		System.out.println("Class TestM: methodPublic");
	}
		
		
}
	


		
	

