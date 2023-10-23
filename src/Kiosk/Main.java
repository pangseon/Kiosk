package Kiosk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Menu menu = new Menu();
        order order= new order();

        menu.addMenu("Burgers","앵거스 비프 통살을 다져만든 버거");
        menu.addMenu("Forzen Custard","매장에서 신선하게 만드는 아이스크림");
        menu.addMenu("Drinks","매장에서 직접 만드는 음료");
        menu.addMenu("Beer","뉴욕 브루클린 브루어리에서 양조한 맥주");

        order.addOrder(menu);


        menu.addProduct("Burgers","ShackBurger","토마토, 양상추, 쉑소스가 토핑된 치즈버거",6.9);
        menu.addProduct("Burgers","SmokeShack","베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거",8.9);
        menu.addProduct("Burgers","Shroom Burger","몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거",9.4);
        menu.addProduct("Burgers","Cheeseburger","포테이토 번과 비프패티, 치즈가 토핑된 치즈버거",6.9);
        menu.addProduct("Burgers","Hamburger","비프패티를 기반으로 야채가 들어간 기본버거",5.4);
        menu.addProduct("Forzen Custard","Shake","맛있는 쉐이크",6.4);

        menu.onboard();


    }
}