public class TestProduct
{ 
    public static void main(String[] args)
    {
        //create two product object
        Product product1 = new Product("Pen", 50);
        Product product2 = new Product("Biscuit", 100);

        //print product
        System.out.println("Product1 " + product1.printProduct() + " at N" + product1.getPrice());
        System.out.println("Product2 " + product2.printProduct() + " at N" + product2.getPrice());

        //reduce price by 5naria
        product1.setPrice(product1.getPrice() - 5);
        product2.setPrice(product2.getPrice() - 5);
        
        System.out.println("Product1 " + product1.printProduct() + " at N" + product1.getPrice());
        System.out.println("Product2 " + product2.printProduct() + " at N" + product2.getPrice());
    }
}

class Product
{
    //attributes
    private String name;
    private int price;

    //constructor
    public Product(String NAME, int PRICE)
    {
        name = NAME;
        price = PRICE;
    }

    public String printProduct()
    {
        return name;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int newPrice)
    {
        price = newPrice;
    }
}
