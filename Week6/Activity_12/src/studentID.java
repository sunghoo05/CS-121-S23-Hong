public class studentID
{
    String name;
    String age;
    String gpa;
    String nationality;

    // Constructor
    public studentID(String name, String age, String gpa, String nationality)
    {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.nationality = nationality;
    }

    void printID()
    {
        System.out.printf("Name: %s%nAge: %s%nGPA: %s%nNationality: %s", name, age, gpa, nationality);
    }
}