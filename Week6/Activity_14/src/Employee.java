public class Employee
{
    private String employeeName;
    private String employer;
    private int salary;
    private double workHour;

    public Employee()
    {
    }

    public Employee(String employeeName)
    {
        this.employeeName = employeeName;
    }

    public Employee(String employeeName, String employer, int salary, double workHour)
    {
        this.employeeName = employeeName;
        this.employer = employer;
        this.salary = salary;
        this.workHour = workHour;
    }


    // getter methods
    public String getEmployeeName()
    {
        return employeeName;
    }
    public String getEmployer()
    {
        return employer;
    }
    public int getSalary()
    {
        return salary;
    }
    public double getWorkHour()
    {
        return workHour;
    }

    // setter methods
    public void setEmployeeName(String s)
    {
        employeeName = s;
    }
    public void setEmployer(String s)
    {
        employer = s;
    }
    public void setSalary(int i)
    {
        salary = i;
    }
    public void setWorkHour(double d)
    {
        workHour = d;
    }

    // Overloaded Methods
    public void setEmployeeInformation(String ee, String er)
    {
        employeeName = ee;
        employer = er;
    }

    public void setEmployeeInformation(String ee, String er, int i, double d)
    {
        employeeName = ee;
        employer = er;
        salary = i;
        workHour = d;
    }
}