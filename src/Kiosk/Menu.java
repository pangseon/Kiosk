package Kiosk;
import java.util.Scanner;
public class Menu {
        // menu[0] => burger , menu[1] = ice
        // burger, info
        // 인스턴스 각 개체마다 고유의 값을 특징
        // burger_product
        // int number = 0 ;
        // method => number 9;
        // m[0].product , m[1].product , m[2], m[3]
        // String[] a = new String [10]
        // m[0] => burger ,
        // menu name, info, number
        // m[0] -> burger
        // product[0] shack
        // product[1] chese
        // m[0] -> burger
        product[] products;
        String name;
        String info;
        int number;
        Menu[] menus;
        order order;
        public Menu(String menu_name,String menu_info){
                this.name = menu_name;
                this.info = menu_info;
                this.number=0;
                this.products= new product[10];
        }
        public Menu(){
                this.number=0;
                this.menus = new Menu[10];
                this.order = new order();
        }
        public Menu(int i){
                this.number = 0;
        }

        public void addMenu(String menu_name, String menu_info){
                menus[number] = new Menu(menu_name,menu_info);
                this.number++;
        }
        public void addProduct(String menu_name, String product_name,String product_info, double price){
                for (int i=0; i<this.number; i++){
                        if(menu_name == menus[i].name){
                                menus[i].products[menus[i].number] = new product(product_name,product_info,price);
                                menus[i].number++;
                        }
                }
        }
        public void onboard(){
                this.menu_onboard();
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                if (a>0 && a<number-2){
                        order.add_Basket(this,a);
                } else if (a==5) {
                        order.basket_onboard(this);
                } else if (a==6) {
                        order.order_set();
                }
        }
        public void products_onboard(int a){
                for (int i = 0; i<this.number;i++){
                        if (i==a-1){
                                for (int j = 0; j<menus[i].number;j++) {
                                        System.out.println(j+1+"."+"|"+menus[i].products[j].name+"|"+menus[i].products[j].price+"|"+menus[i].products[j].info);
                                }
                        }
                }
        }
        public void menu_onboard(){
                for (int i = 0; i<this.number; i++){
                        System.out.println((i+1)+"."+"|"+menus[i].name+"|"+menus[i].info);
                }
        }
}