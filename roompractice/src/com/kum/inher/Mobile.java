package com.kum.inher;

public class Mobile {
public static void main(String[] args) {
BasicPhone basicPhone = new BasicPhone();
 basicPhone.brand="Karban";
 basicPhone.colour="Black";
 basicPhone.cost=1200;
 basicPhone.sim=1;
 System.out.println(basicPhone.brand);
 System.out.println(basicPhone.colour);
 System.out.println(basicPhone.cost);
 System.out.println(basicPhone.sim);
 basicPhone.call();
 basicPhone.text();
 System.out.println("********************************");
 SmartPhone smartPhone = new SmartPhone();
 smartPhone.brand="Readme";
 smartPhone.colour="Red";
 smartPhone.cost=20000;
 smartPhone.sim=2;
 System.out.println(smartPhone.brand);
 System.out.println(smartPhone.colour);
 System.out.println(smartPhone.cost);
 System.out.println(smartPhone.sim);
 smartPhone.pubg();
 smartPhone.surfing();
 smartPhone.text();
 smartPhone.call();

}
}
