import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

class Person {
	private String name;
	private GregorianCalendar dob;

	Person() {
		name = "";
		dob = new GregorianCalendar (0,0,0);
	}

	String getName() {
		return name;
	}
	GregorianCalendar getDOB() {
		return dob;
	}

	void setName(String name) {
		this.name = name;
	}

	void setDOB(int date, int month, int year) {
		dob = new GregorianCalendar(year,month,date);
	}
}

class CollegeGraduate extends Person {

	private float gpa;
	private int yog; //year of graduation

	CollegeGraduate(String name, int date, int month, int year) {
		super();
		setName(name);
		setDOB(date, month, year);
		gpa = 0.0f;
		yog = 0;
	}

	String getName() {
		return super.getName();
	}

	GregorianCalendar getDOB() {
		return super.getDOB();
	}

	float getGPA() {
		return this.gpa;
	}
	int getYOG() {

		return this.yog;
	}

	void setGPA(float gpa) {
		this.gpa = gpa;
	}

	void setYOG(int yog) {
		this.yog = yog;
	}
}

class PersonDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input name: ");
		String name = sc.nextLine();
		System.out.print("Input date of birth: ");
		int date = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();
		System.out.print("Enter gpa: ");
		float gpa = sc.nextFloat();
		System.out.print("Enter the year of gradutaion: ");
		int yog = sc.nextInt();
		CollegeGraduate cg = new CollegeGraduate(name,date,month,year);

		cg.setYOG(yog);
		cg.setGPA(gpa);

		GregorianCalendar obj = new GregorianCalendar(0,0,0);
		obj = cg.getDOB();
		System.out.println("-------------------------------");
		System.out.println("Name: "+ cg.getName());
		System.out.println("Date of Birth: "+ obj.get(Calendar.DATE)+" "+obj.get(Calendar.MONTH)+" "+obj.get(Calendar.YEAR));
		System.out.println("GPA: "+ cg.getGPA());
		System.out.println("Year Of Graduation: "+ cg.getYOG());
	}
}




