import java.util.ArrayList;
public class Student {
	private String name;
	private ArrayList<String>subject;
	private ArrayList<Character>grade;
	public Student(String n) {
		name=n;
		subject=new ArrayList<String>();
		grade=new ArrayList<Character>();
	}
	public String getName() {
		return name;
	}
	public void add(String s,Character g) {
		subject.add(s);
		grade.add(g);
	}
	public ArrayList<String>getSubjects(){
		return subject;
	}
	public double getGPA() {
		double total=0.0;
		for(char g:grade) {
			switch(g) {
			case 'A':
				total+=4.0;
				break;
			case 'B':
				total+=3.0;
				break;
			case 'C':
				total+=2.0;
				break;
			case 'D':
				total+=1.0;
				break;
			case 'F':
				total+=0.0;
				break;
			}
		}
		return total/grade.size();
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
}
