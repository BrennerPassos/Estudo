package com.company;

public class HealthyBurger extends Hamburger{

    private Additions additions5;
    private Additions additions6;

    public HealthyBurger(String name, String meat, double price) {
        super(name, "Brown Rye Bread", meat, price);
    }

    @Override
    public void totalItensList() {
        super.totalPrice();
        System.out.println(" - "+additions5.getName());
        System.out.println(" - "+additions6.getName());
    }

    @Override
    public void totalPrice() {
        System.out.println("Total: $"+this.getPrice()+
                getAdditions1().getPrice()+
                getAdditions2().getPrice()+
                getAdditions3().getPrice()+
                getAdditions4().getPrice()+
                additions5.getPrice()+
                additions6.getPrice());
    }

    public Additions getAdditions5() {
        return additions5;
    }

    public Additions getAdditions6() {
        return additions6;
    }
}
