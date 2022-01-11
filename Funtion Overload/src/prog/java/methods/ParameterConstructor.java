package prog.java.methods;

public class ParameterConstructor {
	String name;
	int age;
	char section;
	char gender;
	int subject1;
	int subject2;
	int subject3;
	
	ParameterConstructor(String n, int a, char s, char g, int s1, int s2, int s3){
		name = n;
		age = a;
		section = s;
		gender = g;
		subject1 = s1;
		subject2 = s2;
		subject3 = s3;
	}
	public int marks(){
		return subject1+subject2+subject3;
	}
	public float percentage(){
		return (marks()*100/300);
	}
	public static void main(String[] args) {
		ParameterConstructor s1 = new ParameterConstructor("john", 24, 'A', 'M', 77,79,89);
		ParameterConstructor s2 = new ParameterConstructor("Nick", 29, 'B', 'M', 0,56,43);
		ParameterConstructor s3 = new ParameterConstructor("Tom", 23, 'A', 'M', 0,89,66);
		ParameterConstructor s4 = new ParameterConstructor("Gosh", 24, 'B', 'F', 79,98,87);
		
		System.out.println("Marks of student s1 "+ s1.marks() + " Percentage of student s1 "+ s1.percentage());
		System.out.println("Marks of student s2 "+ s2.marks() + " Percentage of student s2 "+ s2.percentage());	
	}

}
