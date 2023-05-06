public class BigO
{
    public BigO()
    {

    }

    public void printOnce(int i)
    {
        System.out.println(i);
    }

    public void printNTimes(int n)
    {
        for (int i = 0; i < n; i++)
        {
            System.out.print(i);
        }
        System.out.println("");
    }

    public void printNSquaredTimes(int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(i + " " + j);
            }
            System.out.println("");
        }
    }
}