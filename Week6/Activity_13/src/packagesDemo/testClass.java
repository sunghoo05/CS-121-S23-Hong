package packagesDemo;

public class testClass
{
    public static void main(String[] args)
    {
        Student sungHoo = new Student("060901", "Sung Hoo Hong", "Indiana Academy for Science, Math, and Humanities", 4.33, 11);

        // see which variables can be run

        // these 3 variables cannot be run because their type is private, meaning that it can only be accessed in the class
        System.out.println(sungHoo.studentID);
        System.out.println(sungHoo.studentName);
        System.out.println(sungHoo.schoolName);

        // these 2 variables can be run because their type is public, meaning that it can be accessed in any classes
        System.out.println(sungHoo.gradeLevel);
        System.out.println(sungHoo.GPA);

        // see which methods can be run

        // this method cannot be run because its type is private
        sungHoo.getStudentID();

        // these methods can be run because their types are not private
        sungHoo.getStudentName();
        sungHoo.getSchoolName();
        sungHoo.getGradeLevel();
        sungHoo.getGPA();

    }
}