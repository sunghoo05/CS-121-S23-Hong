package Interface;

import AbstractClasses.MonWedFriStudent;
import AbstractClasses.TueThuStudent;

public class Main
{
    public static void main(String[] args)
    {
        MWFStudent student1 = new MWFStudent(1,"Josh", 7);
        TTStudent student2 = new TTStudent(2, "John", 7);
        System.out.println(student1.getName() + "'s Class Hour per week: " + student1.calculateSchoolHours());
        System.out.println(student2.getName() + "'s Class Hour per week: " + student2.calculateSchoolHours());
    }
}