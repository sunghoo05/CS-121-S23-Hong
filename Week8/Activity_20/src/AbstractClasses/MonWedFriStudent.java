package AbstractClasses;

public class MonWedFriStudent extends Student
{
    public MonWedFriStudent(int id, String Name, int classAmountPerDay) {
        super(id, Name, classAmountPerDay);
    }

    public double calculateClassHour()
    {
        return getClassAmountPerDay() * 0.5 * 3;
    }
}