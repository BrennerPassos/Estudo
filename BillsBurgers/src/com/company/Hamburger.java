package com.company;

public class Hamburger {

    private String name;
    private String rollType;
    private String meat;
    private double price;

    private Additions additions1;
    private Additions additions2;
    private Additions additions3;
    private Additions additions4;


    public Hamburger(String name, String rollType, String meat, double price) {
        this.name = name;
        this.rollType = rollType;
        this.meat = meat;
        this.price = price;
    }

    public void totalPrice(){
        System.out.println("Total: $"+this.price+
                additions1.getPrice()+
                additions2.getPrice()+
                additions3.getPrice()+
                additions4.getPrice());
    }

    public void totalItensList(){
        System.out.println("List of Items Selected: ");
        System.out.println("------------------------");
        System.out.println(this.name);
        System.out.println(" - "+this.rollType);
        System.out.println(" - "+this.meat);
        System.out.println("Additions: ");
        System.out.println(" - "+additions1.getName());
        System.out.println(" - "+additions2.getName());
        System.out.println(" - "+additions3.getName());
        System.out.println(" - "+additions4.getName());
    }

    public String getName() {
        return name;
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public Additions getAdditions1() {
        return additions1;
    }

    public Additions getAdditions2() {
        return additions2;
    }

    public Additions getAdditions3() {
        return additions3;
    }

    public Additions getAdditions4() {
        return additions4;
    }
}
