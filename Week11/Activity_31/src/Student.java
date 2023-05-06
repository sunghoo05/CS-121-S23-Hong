import java.util.LinkedList;

public class Student
{
    private String firstName;
    private String lastName;
    private int ID;
    private String major;
    private String classStanding;
    private double gpa;
    private LinkedList<String> courseList;

    public Student(String firstName, String lastName, int ID, String major, String classStanding)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.major = major;
        this.classStanding = classStanding;
        this.courseList = new LinkedList<String>();
    }

    public void addCourse(String courseName)
    {
        this.courseList.add(courseName);
    }

    public void removeCourse(String courseName)
    {
        this.courseList.remove(courseName);
    }

    public String getStudentInfo()
    {
        return "Name: " + this.firstName + " " + this.lastName + "\n" +
                "ID: " + this.ID + "\n" +
                "Major: " + this.major + "\n" +
                "Class Standing: " + this.classStanding + "\n" +
                "GPA: " + this.gpa;
    }

    public void displayStudentCourses()
    {
        System.out.println("Courses:");
        for (String course : this.courseList)
        {
            System.out.println(course);
        }
    }
}