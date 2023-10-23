package Kiosk;

import java.util.Scanner;

public class order extends Menu{


    order[] orders;

    String name;
    int number;

    String info;
    double price;

    double price_total = 0.0;

    public order(){
        super(1);
        this.orders = new order[10];
    }
    public order(String product_name, double product_price,String product_info){
        this.name = product_name;
        this.price = product_price;
        this.info = product_info;
        this.number=1;
    }
    public void onboard(Menu m){
        System.out.println(m.menus[number].products[number].name);
    }
    public void add_Basket(Menu m, int a){
        m.products_onboard(a);
        System.out.println("추가하실 상품 번호를 입력하세요");
        Scanner sc = new Scanner(System.in);
        int choice_product = sc.nextInt();
        System.out.println(m.menus[a-1].products[choice_product-1].name +" |  " +m.menus[a-1].products[choice_product-1].price+" |  "+m.menus[a-1].products[choice_product-1].info);
        System.out.println("위 상품을 추가하시겠습니까?");
        System.out.println("1.추가"+"      "+"2.취소");
        int choice_number = sc.nextInt();
        if(choice_number==1){
            orders[number] = new order(m.menus[a-1].products[choice_product-1].name,m.menus[a-1].products[choice_product-1].price, m.menus[a-1].products[choice_product-1].info);
            this.price_total +=m.menus[a-1].products[choice_product-1].price;
            this.number++;
            m.onboard();
        }
        m.onboard();
    }


    public void basket_onboard(Menu m){
        for (int i = 0 ; i<this.number;i++){
            if(orders[i].name == null){
                break;
            }
            else
                System.out.println(orders[i].name+" | "+orders[i].price+" | "+orders[i].info);
        }
        System.out.println(Math.round(price_total*100)/100.0);
        System.out.println("---------------------");
        System.out.println("1.구매"+ "     "+"2.메뉴로 이동");
        Scanner sc = new Scanner(System.in);
        int purchase = sc.nextInt();
        if (purchase==1){
            System.out.println("구매가 완료되었습니다.");
            m.onboard();
        }
        else {
            m.onboard();
        }
    }
    public void order_set(){
        System.out.println("주문목록을 초기화하시겠습니까?");
        for (int i=0; i<this.number; i++){
            orders[i] = null;
            this.number=0;
        }
    }
    public void addOrder(Menu m){
        m.addMenu("Order","장바구니를 확인 후 주문합니다.");
        m.addMenu("Cancel","진행중인 주문을 취소합니다.");
    }
}