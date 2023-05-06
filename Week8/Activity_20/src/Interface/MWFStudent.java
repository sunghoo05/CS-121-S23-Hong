package Interface;

public class MWFStudent implements CalculateSchoolHours
{
    private int id;
    private String Name;
    private int classAmountPerDay;

    public MWFStudent(int id, String Name, int classAmountPerDay)
    {
        this.id = id;
        this.Name = Name;
        this.classAmountPerDay = classAmountPerDay;
    }
    public int getID()
    {
        return id;
    }

    public String getName()
    {
        return Name;
    }

    public int getClassAmountPerDay()
    {
        return classAmountPerDay;
    }

    public void setID(int id)
    {
        this.id = id;
    }

    public void setName(String Name)
    {
        this.Name = Name;
    }

    public void setClassAmountPerDay(int i)
    {
        this.classAmountPerDay = i;
    }

    @Override
    public double calculateSchoolHours() {
        return classAmountPerDay * 0.5 * 3;
    }
}