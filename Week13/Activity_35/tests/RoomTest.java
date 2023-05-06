import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RoomTest
{
    private Room hall = new Room("Hall");

    @Test
    public void getName()
    {
        assertEquals("Hall", hall.getName());
    }

    @Test
    public void checkContents()
    {
        assertFalse(hall.checkContents());
    }

    @Test
    public void getContent()
    {
        assertEquals("", hall.getContent());
    }
}