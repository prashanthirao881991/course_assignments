import java.util.Date;

public class SwiggyMethodOverloading {
    private static SwiggyMethodOverloading smo;

    public static void main(String[] args) {
        smo =new SwiggyMethodOverloading();
        smo.login();
        smo.login("test","test");
        smo.login("test","test",true);
        smo.payment();
        smo.payment("cc",true);
        smo.addToCart();
        smo.addToCart("2",true);
        smo.orders();
        smo.orders(3,4500,"#12345");
        smo.orderHistory();
        smo.orderHistory("#1234");
        smo.orderHistory("Last 6 months","#1234");
        smo.orderHistory("20-02-2022","#1234");
        smo.search();
        smo.search("place/item/shop/coupon");
    }

    public void login(){
        System.out.println("Login Method Zero Parameterized!");
    }

    public void login(String un, String pw){
        System.out.println("Login Method with 2 Parameters!");
    }

    public void login(String un, String pw, boolean keepMeSigned){
        System.out.println("Login Method with 3 Parameters!");
    }

    public void payment(){
        System.out.println("Payment Method Zero Parameterized!");
    }

    public void payment(String paymentType,boolean saveMyCard){
        System.out.println("Payment Method 2 Parameters!");
    }

    public void addToCart(){
        System.out.println("Add To Cart Method Zero Parameterized!");
    }

    public void addToCart(int orderCount,boolean saveToWishList){
        System.out.println("Add To Cart Method 2 Parameters!");
    }

    public void orders(){
        System.out.println("Orders Method Zero Parameterized!");
    }

    public void orders(int orderCount,long orderTotal,String orderID){
        System.out.println("Orders Method 3 Parameters");
    }

    public void orderHistory(){
        System.out.println("Order History Method zero Parameter!");
    }

    public void orderHistory(String orderID){
        System.out.println("Order History Method 1 Parameter!");
    }

    public void orderHistory(String orderHistoryFrequency, String orderID){
        System.out.println("Order History Method 2 Parameters!");
    }

    public void orderHistory(Date orderDate, String orderID){
        System.out.println("Order History Method 2 Parameterized!");
    }

    public void search(){
        System.out.println("search Method Zero Parameterized!");
    }

    public void search(String searchTerm){
        System.out.println("search Method 1 Parameter!");
    }


}
