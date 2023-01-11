public class iPhones implements Smartphones, iOS {

    String mark;
    String model;
    String article;
    String color;
    int price;

    Smartphones newSmartphone;

    public iPhones(String mark, String model, String article, String color, int price) {
        this.mark = mark;
        this.model = model;
        this.article = article;
        this.color = color;
        this.price = price;
    }

    @Override
    public void call() {
        System.out.println("iPhone is your favorite call");
    }

    @Override
    public void sms() {
        System.out.println("iPhone has great SMS-service");

    }

    @Override
    public void internet() {
        System.out.println("iPhone has Safari");

    }

    @Override
    public void operationCoreiOS() {
        System.out.println("iPhone uses iOS core");

    }
}
