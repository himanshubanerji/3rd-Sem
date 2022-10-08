import java.util.Scanner;
class Building {
	private double sq_footage;
	private int stories;

	double getSqFootage() {
		return sq_footage;
	}

	int getStories() {
		return stories;
	}

	void setSqFootage(double sq_footage) {
		this.sq_footage = sq_footage;
	}

	void setStories(int stories) {
		this.stories = stories;
	}

}

class House extends Building {
	private int bedroom_count, bathroom_count;

	double getSqFootage() {
		return super.getSqFootage();
	}

	int getStories() {
		return super.getStories();
	}

	int getBedroomCount() {
		return bedroom_count;
	}

	int getBathroomCount() {
		return bathroom_count;
	}

	void setBedroomCount(int bedroom_count) {
		this.bedroom_count = bedroom_count;
	}

	void setBathroomCount(int bathroom_count) {
		this.bathroom_count = bathroom_count;
	}
}

class School {
	private int classroom_count;
	private String grade;

	double getSqFootage() {
		return super.getSqFootage();
	}

	int getStories() {
		return super.getStories();
	}

	int getClassroomCount() {
		return classroom_count;
	}

	String getGrade() {
		return grade;
	}

	int setClassroonCount(int classroom_count) {
		this.classroom_count = classroom_count;
	}

	String setGrade(String grade) {
		this.grade = grade;
	}
}

class BuildingDemo {
	public static void main(String[] args) {
		Building b = new Building();
		House h = new House();
		School s = new School();

		
	}
}