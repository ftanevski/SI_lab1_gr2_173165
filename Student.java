import java.util.*;
import java.util.List;

public class Student {
	String index;
	String firstName;
	String lastName;
	ArrayList<Integer> grades;

	//TODO constructor
	public Student(String index, String firstName, String lastName) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		grades = new ArrayList<Integer>();
	}

	//TODO seters & getters
	public String getIndex() {
		return index;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public ArrayList<Integer> getGrades() {
		return grades;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setGrades(ArrayList<Integer> grades) {
		this.grades = grades;
	}


	public double getAverage() {
		//TODO
		int sum = 0;
		float res;
		for (int i = 0; i < grades.size(); i++) {
			sum += grades.get(i);
		}
		res = sum / grades.size();
		return res;
	}

	public int ECTSCredits() {
		//TODO
		int suma = 0;
		for (int i = 0; i < grades.size(); i++){
			if (grades.get(i) > 5){
				suma += 6;
			}
		}
		return suma;
	}

}