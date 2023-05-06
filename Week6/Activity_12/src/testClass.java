public class testClass
{
    public static void main(String[] args)
    {
        studentID sungHoo = new studentID("Sung Hoo Hong", "16", "4.0", "South Korea");
        courses sungHooCourse = new courses("Multivariable Calculus", "AP Chemistry", "AP Physics C", "CS121");

        System.out.println("Student ID");
        sungHoo.printID();
        System.out.println();
        System.out.println();
        System.out.println("Student's Courses");
        sungHooCourse.printCourse();
    }
}