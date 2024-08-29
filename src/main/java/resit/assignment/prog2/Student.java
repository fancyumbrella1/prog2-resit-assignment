package resit.assignment.prog2;

public class Student {
    private String StudentID;
    private String StudentName;
    private int age;
    private char gender;
    private int grade;
    private String yearOfAdmissior;
    private String yearOfGraduation;
    
    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getYearOfAdmissior() {
        return yearOfAdmissior;
    }

    public void setYearOfAdmissior(String yearOfAdmissior) {
        this.yearOfAdmissior = yearOfAdmissior;
    }

    public String getYearOfGraduation() {
        return yearOfGraduation;
    }

    public void setYearOfGraduation(String yearOfGraduation) {
        this.yearOfGraduation = yearOfGraduation;
    }
    @Override
    public String toString() {
        return "Student{" +
                "StudentID='" + StudentID + '\'' +
                ", StudentName='" + StudentName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", yearOfAdmissior='" + yearOfAdmissior + '\'' +
                ", yearOfGraduation='" + yearOfGraduation + '\'' +
                '}';
    }

}
