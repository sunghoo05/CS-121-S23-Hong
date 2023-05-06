package inheritance;

public class Professor extends UniversityMember
{
    private String ongoingProject;
    private String department;
    private void setOngoingProject (String s)
    {
        this.ongoingProject = s;
    }

    private void setDepartment (String s)
    {
        this.department = s;
    }

    private String getOngoingProject()
    {
        return ongoingProject;
    }

    private String getDepartment ()
    {
        return department;
    }
}