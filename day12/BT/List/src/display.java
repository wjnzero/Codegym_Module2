public class display {
    public static void main(String[] args) {
        ProductManager pro = new ProductManager();
        pro.add(new Product("01","AK47",5000000));
        pro.add(new Product("02","M14",5000000));
        pro.add(new Product("03","Katana",500000));
//        pro.displayAll();
//        pro.set(new Product("03","Katana",500000),2);
//        pro.delete(2);
        pro.search("Katana");
    }
}
