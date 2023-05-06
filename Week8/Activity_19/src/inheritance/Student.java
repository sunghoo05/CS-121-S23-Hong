package inheritance;

public class Student extends UniversityMember
{
    private int yearOfClass;
    private String major;

    private void setYearOfClass (int i)
    {
        this.yearOfClass = i;
    }

    private void setMajor(String s)
    {
        this.major = s;
    }

    private int getYearOfClass()
    {
        return yearOfClass;
    }

    private String getMajor()
    {
        return major;
    }

    private String toString(int yearOfClass)
    {
        return toString(yearOfClass);
    }
}