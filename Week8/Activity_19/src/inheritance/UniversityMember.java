package inheritance;

public class UniversityMember
{
    private String contactInformation;
    private int ID;
    private String firstName;
    private String lastName;

    private void setContactInformation(String s)
    {
        this.contactInformation = s;
    }

    private void setID(int i)
    {
        this.ID = i;
    }

    private void setFirstName(String s)
    {
        this.firstName = s;
    }

    private void setLastName(String s)
    {
        this.lastName = s;
    }

    private String getContactInformation()
    {
        return contactInformation;
    }

    private int getID()
    {
        return ID;
    }

    private String getName()
    {
        return firstName + lastName;
    }

    private String toString(int id)
    {
        return toString(id);
    }
}