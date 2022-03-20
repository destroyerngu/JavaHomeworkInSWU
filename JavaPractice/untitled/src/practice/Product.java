package practice;

/**
 * @author Destroyerngu
 * @date 2022/3/3 - 20:33
 */
public class Product {
    int ID;
    String name;
    String categories;
    double productPrice;
    Product(int id,String nm,String categ,double price)
    {
        ID = id;
        name = nm;
        categories = categ;
        productPrice = price;
    }
    Product(){}
}
