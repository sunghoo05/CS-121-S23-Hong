public class Main {
    public static void main(String[] args)
    {
        // Create 3 instances
        Employee sung = new Employee();
        Employee hoo = new Employee("Sung Hoo Hong");
        Employee hong = new Employee("Sung Hoo Hong", "Indiana State", 10000, 4.5);

        // Call methods
        sung.setEmployeeInformation("Sung Hoo Hong", "Indiana State");
        System.out.println("Employee Name: " + sung.getEmployeeName());
        System.out.println("Employer: " + sung.getEmployer());
        System.out.println("Salary: " + sung.getSalary());
        System.out.println("Work Hour: " + sung.getWorkHour());

        System.out.println();

        sung.setEmployeeInformation("Sung Hoo Hong", "Indiana State", 10000, 4.5);
        System.out.println("Employee Name: " + sung.getEmployeeName());
        System.out.println("Employer: " + sung.getEmployer());
        System.out.println("Salary: " + sung.getSalary());
        System.out.println("Work Hour: " + sung.getWorkHour());

    }
}