public class Androids implements Smartphones, LinuxOS {

    String mark;
    String model;
    String article;
    String color;
    int price;

    public Androids(String mark, String model, String article, String color, int price) {
        this.mark = mark;
        this.model = model;
        this.article = article;
        this.color = color;
        this.price = price;
    }

    @Override
    public void call() {
        System.out.println("Android is calling nice");

    }

    @Override
    public void sms() {
        System.out.println("Android has SMS-service");

    }

    @Override
    public void internet() {
        System.out.println("Android has Google");

    }

    @Override
    public void operationCoreLinux() {
        System.out.println("Android uses Linux core");
    }



}
