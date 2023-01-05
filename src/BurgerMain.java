public class BurgerMain {
    public static void main(String[] args) {

        Burger burger = new Burger();
        Burger burgerDiet = new Burger("Бургер дієтичний ", 1,1,1,1);
        Burger burgerDoubleMeat = new Burger("Бургер з подвійним м'ясом ", 1,2,1,1,
                1);

    System.out.println(burger);
    System.out.println(burgerDiet);
    System.out.println(burgerDoubleMeat);

    }
}



