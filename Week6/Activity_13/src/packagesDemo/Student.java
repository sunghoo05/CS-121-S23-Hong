package packagesDemo;

public class Student
{
    // instance variables
    private String studentID;
    private String studentName;
    private String schoolName;
    public double GPA;
    public int gradeLevel;

    // Constructor
    public Student(String studentID, String studentName, String schoolName, double GPA, int gradeLevel)
    {
        this.studentID = studentID;
        this.studentName = studentName;
        this.schoolName = schoolName;
        this.GPA = GPA;
        this.gradeLevel = gradeLevel;
    }

    // Methods

    // PUBLIC
    public void getGPA()
    {
        System.out.println("Student's GPA: " + GPA);
    }


    // PRIVATE
    private void getStudentID()
    {
        System.out.println("Student's ID: " + studentID);
    }


    // PROTECTED
    protected void getGradeLevel()
    {
        System.out.println("Student's Grade Level: " + gradeLevel);
    }

    // DEFAULT
    void getSchoolName()
    {
        System.out.println("Student's School Name: " + schoolName);
    }

    // DEFAULT
    void getStudentName()
    {
        System.out.println("Student's Name: " + studentName);
    }
}