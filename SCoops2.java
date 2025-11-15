

class Product
{
    private String itemNo;
    private String name;
    private double price;
    private short qty;
    
    public Product(String itemno)
    {
        itemNo=itemno;
    }
    public Product(String itemno,String name)
    {
        itemNo=itemno;
        this.name=name;
    }
    public Product(String itemno,String name,double price,short qty)
    {
        itemNo=itemno;
        this.name=name;
        setPrice(price);
        setQuantity(qty);
    }
    
    public String getItemNo(){return  itemNo;}
    public String getName(){return name;}
    public double getPrice(){return price;}
    public short getQuantity(){return qty;}
    
    
    /** 
     * @param price
     */
    public void setPrice(double price)
    {
        this.price=price;
    }
    public void setQuantity(short qty)
    {
        this.qty=qty;
    }
}

class Customer
{
    private String custId;
    private String name;
    private String address;
    private String phno;
    
    public Customer(String custId,String name)
    {
        this.custId=custId;
        this.address=name;
    }
    public Customer(String custId,String name,String address,String phno)
    {
        this.custId=custId;
        this.address=name;
        setAddress(address);
        setPhno(phno);
    }
    
    public String getCustId(){return custId;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public String getPhno(){return phno;}
    
    public void setAddress(String address)
    {
        this.address=address;
    }
    public void setPhno(String phno)
    {
        this.phno=phno;
    }
}

public class SCoops2 
{
    public static void main(String[] args) 
    {
     // Create Product instances
        Product prod1 = new Product("P001", "Laptop", 999.99, (short) 10);
        Product prod2 = new Product("P002", "Smartphone", 599.99, (short) 20);
        
        // Display Product details
        System.out.println("Product 1: ");
        System.out.println("Item No: " + prod1.getItemNo());
        System.out.println("Name: " + prod1.getName());
        System.out.println("Price: $" + prod1.getPrice());
        System.out.println("Quantity: " + prod1.getQuantity());

        System.out.println("\nProduct 2: ");
        System.out.println("Item No: " + prod2.getItemNo());
        System.out.println("Name: " + prod2.getName());
        System.out.println("Price: $" + prod2.getPrice());
        System.out.println("Quantity: " + prod2.getQuantity());

        // Create Customer instances
        Customer cust1 = new Customer("C001", "Alice", "123 Main St", "555-1234");
        Customer cust2 = new Customer("C002", "Bob", "456 Oak Ave", "555-5678");
        
        // Display Customer details
        System.out.println("\nCustomer 1: ");
        System.out.println("Customer ID: " + cust1.getCustId());
        System.out.println("Name: " + cust1.getName());
        System.out.println("Address: " + cust1.getAddress());
        System.out.println("Phone Number: " + cust1.getPhno());

        System.out.println("\nCustomer 2: ");
        System.out.println("Customer ID: " + cust2.getCustId());
        System.out.println("Name: " + cust2.getName());
        System.out.println("Address: " + cust2.getAddress());
        System.out.println("Phone Number: " + cust2.getPhno());

    }   
}