import pkgPizza.Pizza;
import pkgPizza.Topping;

public class Main {
    public static void main(String[] args) {
        Pizza pizza=new Pizza("Extravaganzia",    0);
        pizza.addTopping(new Topping("Tomate",  15));
        pizza.addTopping(new Topping("Piña",    10));
        pizza.addTopping(new Topping("Peperoni",50));
        pizza.addTopping(new Topping("Jamon",   30));
        pizza.addTopping(new Topping("Champiñones",10));
        pizza.addTopping(new Topping("Queso Mozzarella",20));

        pizza.prepare();
    }
}