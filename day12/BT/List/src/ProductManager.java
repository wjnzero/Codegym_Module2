import java.util.LinkedList;
import java.util.List;

public class ProductManager{
    public static List<Product> listProduct = new LinkedList<>();

    public void add(Product p){
        listProduct.add(p);
    }
    public void displayAll(){
        for (Product m: listProduct
        ) {
            System.out.println(m);
        }
    }
    public void search(String name){
        boolean exist = false;
        for (Product m: listProduct
        ) {
            if (m.getName().equals(name)){
                System.out.println(m);
                exist = true;
                break;
            }
        }
        if (!exist)
            System.out.printf("Product with name: %s not in list",name);
    }

    public void set(Product p, int index){
        listProduct.set(index,p);
    }
    public void delete(int index){
        listProduct.remove(index);
    }
    public void soft(Product p){
        listProduct.sort(p);
    }


}
