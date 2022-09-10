//program to repesent hours minutes and seconds

import java.util.Scanner;
class Time {
	int hours, minutes, seconds;

	void setParams(int hours, int minutes, int seconds) {
		this.hours = hour;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	void display() {
		if()
	}

	Time add(Time a,Time b) {
		Time result = new Time();
		result.hours = a.hours + b.hours;
		result.minutes= a.minutes + b.minutes;
		result.seconds = a.seconds + b.seconds;
		
		if(result.seconds >= 60)
		{
			result.seconds = result.seconds - 60;
			result.minutes = result.minutes + 1;

		}
		if(result.minutes >= 60)
		{
			result.minutes = result.minutes - 60;
			result.hours = result.hours + 1;
		}

		result.hours = (result.hours >= 24) ? result.hours-24 : result.hours;
	}
}

class TimeDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter time1: ); 
		int hours = sc.nextInt();
		int minutes = sc.nextInt();
		int seconds = sc.nextInt();

		Time t1= new Time();
		t1.setParams(hours,minutes,seconds);

		System.out.println("Enter time2: );  
		int hours = sc.nextInt();
		int minutes = sc.nextInt();
		int seconds = sc.nextInt();

		Time t2= new Time();
		t2.setParams(hours,minutes,seconds);

		Time result = new Time();
		result = result.add();
		result.display();
	}
}
