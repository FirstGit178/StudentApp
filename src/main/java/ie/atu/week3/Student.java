package ie.atu.week3;

public class Student
{
    private String nameStudent;
    private String emailStudent;
    private String courseStudent;

    public Student() {
        nameStudent = "";
        emailStudent = "";
        courseStudent = "";
    }

    public Student(String nameStudent) {
        this.nameStudent = nameStudent;
        emailStudent = "";
        courseStudent = "";
    }

    public Student(String nameStudent, String emailStudent, String courseStudent) {
        this.nameStudent = nameStudent;
        this.emailStudent = emailStudent;
        this.courseStudent = courseStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getEmailStudent() {
        return emailStudent;
    }

    public void setEmailStudent(String emailStudent) {
        this.emailStudent = emailStudent;
    }

    public String getCourseStudent() {
        return courseStudent;
    }

    public void setCourseStudent(String courseStudent) {
        this.courseStudent = courseStudent;
    }
}
