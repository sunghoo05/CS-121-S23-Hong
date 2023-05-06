public class Main
{
    public static void main(String[] args)
    {
        Student s1 = new Student("Sung Hoo", "Hong", 12345, "Computer Science", "Junior");
        Student s2 = new Student("Daniel", "Yoo", 12346, "Computer Science", "Junior");

        s1.addCourse("CS121");
        s1.addCourse("CS122");
        s1.addCourse("CS123");

        s2.addCourse("CS221");
        s2.addCourse("CS222");
        s2.addCourse("CS223");

        System.out.println(s1.getStudentInfo());

        System.out.println();

        System.out.println(s2.getStudentInfo());

        s1.displayStudentCourses();

        System.out.println();

        s2.displayStudentCourses();

        s1.removeCourse("CS121");
        s2.removeCourse("CS221");

        System.out.println();

        s1.displayStudentCourses();

        System.out.println();

        s2.displayStudentCourses();
    }
}