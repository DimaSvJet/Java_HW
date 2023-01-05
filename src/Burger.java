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
          this.nameBurger = nameBurger;
          this.bun = bun;
          this.meat = meat;
          this.cheese = cheese;
          this.greens = greens;
     }

     public Burger(String nameBurger, int bun, int meat, int cheese, int greens, int mayonnaise) {
          this.nameBurger = nameBurger;
          this.bun = bun;
          this.meat = meat;
          this.cheese = cheese;
          this.greens = greens;
          this.mayonnaise = mayonnaise;
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


