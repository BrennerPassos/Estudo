package com.company;

public class DeluxeBurger extends Hamburger {

    private Additions additions5;
    private Additions additions6;
    private Additions additions7;
    private Additions additions8;


    public DeluxeBurger(String name, String rollType, String meat, double price) {
        super(name, rollType, meat, price);
    }

    @Override
    public void totalPrice() {
        System.out.println("Total: $"+this.getPrice()+
                getAdditions1().getPrice()+
                getAdditions2().getPrice()+
                getAdditions3().getPrice()+
                getAdditions4().getPrice()+
                getAdditions5().getPrice()+
                getAdditions6().getPrice());
    }
    @Override
    public void totalItensList() {
        super.totalItensList();
        System.out.println(" - "+additions5.getName());
        System.out.println(" - "+additions6.getName());
        System.out.println(" - "+additions7.getName());
        System.out.println(" - "+additions8.getName());
        System.out.println(" - Chips and Drink");
    }

    public Additions getAdditions5() {
        return additions5;
    }

    public Additions getAdditions6() {
        return additions6;
    }

    public Additions getAdditions7() {
        return additions7;
    }

    public Additions getAdditions8() {
        return additions8;
    }
}
