package ClassAndObject.model;

public class Product {
    private Integer id;
    private String code;
    private String name;
    private Double price;
    private Integer qty;
    //
    public void setProductInfo(Integer pId,
                               String pCode,
                               String pName,
                               Double pPrice,
                               Integer pQty) {
        id = pId;
        code = pCode;
        name = pName;
        price = pPrice;
        qty = pQty;
    }
public void getProductInfo(){
            System.out.println("Product ID: " + id);
            System.out.println("Product code: " + code);
            System.out.println("Product name: " + name);
            System.out.println("Product price: " + price);
            System.out.println("Product Quantity: " + qty);
    System.out.println("\n");
        }


    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setProductInfo(2022, "bb01" , "noodles",1.2,5);
        Product product2 = new Product();
        product2.setProductInfo(2023, "a01", "cake",10.5, 4);
        product1.getProductInfo();
        product2.getProductInfo();


    }

}
