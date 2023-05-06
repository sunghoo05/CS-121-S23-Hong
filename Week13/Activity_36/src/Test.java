public class Test
{
    public static void main(String[] args)
    {
        CustomerRecord record = new CustomerRecord();
        Customer customer1 = new Customer("Sung Hoo", "Hong", "123-456-789", "xxxxxx@gmail.com", "Driver License", 16);
        record.addCustomer(customer1);
        String allCustomers = record.getAllCustomers();
        System.out.println(allCustomers);
    }
}
