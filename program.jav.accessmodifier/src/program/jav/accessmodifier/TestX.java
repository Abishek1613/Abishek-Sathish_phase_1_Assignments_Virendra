package program.jav.accessmodifier;

public class TestX {
	public char k = 25;
	private int a3 = 30;
	long b3 = 1300;
	protected float c3 = 45.56f;
	
	public void methodPublic(){
		methodPrivate();
	}
	protected void methodProtected(){
		methodPrivate();
	}
	void methidDefault(){
		methodPrivate();
	}
	
	private void methodPrivate(){
		System.out.println("Class TsetM: methodProtected");
		System.out.println("value of protected value c3"+ c3);
		System.out.println("value of private value a3"+ a3);
		System.out.println("value of long"+b3);
		System.out.println("value of age"+k);
		
	}
}
