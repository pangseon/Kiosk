package Kiosk;

public class product extends Menu {


    double price;
    public product(String name, String info, double price){
        super.info= info;
        super.name = name;
        this.price = price;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return this.price;
    }

    public String getInfo(){
        return this.info;
    }
    public void setInfo(String info){
        this.info = info;
    }
    public void printProduct(){
        System.out.println(this.name+"|"+this.price+"|"+this.info);
    }
}