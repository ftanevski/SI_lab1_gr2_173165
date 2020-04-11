import java.util.*;
public class Faculty {
    ArrayList<Student> students;
    String facultyName;

    public Faculty(String facultyName) {
        students = new ArrayList<Student>();
        this.facultyName = facultyName;
    }

    public void AddStudent(Student student) {
        students.add(student);
    }

    public void RemoveStudent(Student s) {
        students.remove(s);
    }
    public double AverageGrade(Student student){
        int sum = 0;
        float res = 0;
        for (int i = 0; i < student.grades.size(); i++) {
            sum += student.grades.get(i);
        }
        res = sum / student.grades.size();
        return res;
    }
    public double AverageCredits(Student student){
        int suma = 0;
        for (int i = 0; i < student.grades.size(); i++){
            if (student.grades.get(i) > 5){
                suma += 6;
            }
        }
        return suma;
    }
}
