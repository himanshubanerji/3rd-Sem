import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

class Student {

	int reg_no;
	String full_name;
	GregorianCalendar doj;
	short semester;
	float gpa, cgpa;
	private static int[] count = new int[100];
	
	private void initialize() {
		for(int i=0; i<100; i++)
			count[i] = 0;
	}

	Student() {

		reg_no = 0;
		full_name = "";
		doj = new GregorianCalendar(0,0,0);
		semester = 0;
		gpa = 0.0f; cgpa = 0.0f;
	}

	Student(String full_name, int date, int month, int year, short semester, float gpa, float cgpa) {

		int x = year%100;
		count[x]++;
		this.full_name = full_name;
		doj = new GregorianCalendar(year,month,date);
		this.semester = semester;
		this.gpa = gpa; 
		this.cgpa = cgpa;

		this.reg_no = ((year%100)*100) + count[x];
	}

	void display() {

		System.out.println("\nRegistration Number: "+ reg_no);
		System.out.println("Name: "+ full_name);
		System.out.println("Date of joining: "+ this.doj.get(Calendar.DATE)+" "+ this.doj.get(Calendar.MONTH)+" "+ this.doj.get(Calendar.YEAR));
		System.out.println("Semester: "+ semester);
		System.out.println("gpa: "+ gpa);
		System.out.println("cgpa: "+ cgpa);
	}
}

class StudentDemo {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		int num = sc.nextInt();
		Student[] student = new Student[num];

		for(int i=0; i<num; i++)
		{
			String full_name;
		 	int date, month, year;
			short semester;
			float gpa, cgpa;
			System.out.print("Enter your name: ");
			sc.nextLine();
			full_name = sc.nextLine();
			System.out.print("Enter date of joining: ");
			date = sc.nextInt();
			month = sc.nextInt();
			year = sc.nextInt();
			System.out.print("Input your current semester: ");
			semester = sc.nextShort();
			sem[i] = semester;

			System.out.print("Enter gpa: ");
			gpa = sc.nextFloat();
			System.out.print("Enter cgpa: ");
			cgpa = sc.nextFloat();
			cgpa_arr[i] = cgpa;

			student[i] = new Student(full_name, date, month, year, semester, gpa, cgpa);
		}
		System.out.println("\n----------------------");

		System.out.println("The details of the student are: ");

		sc.close();
	}

	void sort(int n, STUDENT s) {
		for(int i=0; i<n; i++)
			for(int j=0; i<n; j++)
			{
				if(s[i])
			}
	}
}





