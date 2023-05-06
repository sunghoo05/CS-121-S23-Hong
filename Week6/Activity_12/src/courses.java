public class courses
{
    String course1;
    String course2;
    String course3;
    String course4;

    public courses(String course1, String course2, String course3, String course4)
    {
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.course4 = course4;
    }

    void printCourse()
    {
        System.out.printf("First Course: %s%nSecond Course: %s%nThird Course: %s%nFourth Course: %s%n", course1, course2, course3, course4);
    }
}