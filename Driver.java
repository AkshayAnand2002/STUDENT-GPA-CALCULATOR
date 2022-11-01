
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student a= new Student("a");
		a.add("MATHS",'C');
		a.add("ENGLISH",'A');
		a.add("HISTORY",'B');
		a.add("GEOGRAPHY",'D');
		System.out.println(a.getName()+
				" HAS A GPA OF "+
				a.getGPA());
		System.out.println("IT IS OBTAINED "
				+"FROM THESE SUBJECTS");
		for(String str:a.getSubjects()) {
			System.out.println(str);
		}
	}

}
