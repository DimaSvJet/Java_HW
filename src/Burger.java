public class Burger {
     String nameBurger;
     int bun;
     int meat;
     int cheese;
     int greens;
     int mayonnaise;


     public Burger() {
          this.nameBurger = "Звичайний бургер ";
          this.bun = 1;
          this.meat = 1;
          this.cheese = 1;
          this.greens = 1;
          this.mayonnaise = 1;
     }

     public Burger(String nameBurger, int bun, int meat, int cheese, int greens) {
          this.nameBurger = "Бургер дієтичний ";
          this.bun = 1;
          this.meat = 1;
          this.cheese = 1;
          this.greens = 1;
     }

     public Burger(String nameBurger, int bun, int meat, int cheese, int greens, int mayonnaise) {
          this.nameBurger = "Бургер з подвійним м'ясом ";
          this.bun = 1;
          this.meat = 2;
          this.cheese = 1;
          this.greens = 1;
          this.mayonnaise = 1;
     }

     @Override
     public String toString() {
          return  nameBurger +'{' +
                  "булочка=" + bun +
                  ", м'ясо=" + meat +
                  ", сир=" + cheese +
                  ", зелень=" + greens +
                  ", майонез=" + mayonnaise +
                  '}';
     }
}


