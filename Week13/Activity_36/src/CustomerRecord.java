import java.util.ArrayList;

public class CustomerRecord
{
    private ArrayList<Customer> customers;

    public CustomerRecord()
    {
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer)
    {
        customers.add(customer);
    }

    public String getAllCustomers()
    {
        StringBuilder sb = new StringBuilder();
        for (Customer customer : customers) {
            sb.append("Customer First Name: ").append(customer.getFirstName())
                    .append(", Last Name: ").append(customer.getLastName())
                    .append(", Age: ").append(customer.getAge())
                    .append(", Phone: ").append(customer.getPhone())
                    .append(", Email: ").append(customer.getEmail())
                    .append(", License: ").append(customer.getLicense())
                    .append("\n");
        }
        return sb.toString();
    }
}