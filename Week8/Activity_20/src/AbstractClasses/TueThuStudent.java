package AbstractClasses;

import AbstractClasses.Student;

public class TueThuStudent extends Student
{
    public TueThuStudent(int id, String Name, int classAmount) {
        super(id, Name, classAmount);
    }

    public double calculateClassHour()
    {
        return getClassAmountPerDay() * 0.5 * 2;
    }
}