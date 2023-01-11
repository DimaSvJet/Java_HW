public class HomeWork15 {

    public static void main(String[] args) {

        Androids androids = new Androids("Samsung", "Galaxy", "SM-S901BZGDSEK", "Green",
                29999);

        androids.call();
        androids.sms();
        androids.internet();
        androids.operationCoreLinux(); // метод доступний якщо тип androids є Class так як Class Androids Вже вкдючає
        // цей метод. Відповідно якщо тип androids є interface Smartphones, то цей метод вже недоступний, так як даний
        //interface такий метод не містить.

        Smartphones androids_new = new Androids("Xiaomi", "Redmi Note 10 Pro", "685087", "Gray",
                9999);

        androids_new.call();
        androids_new.sms();
        androids_new.internet();

        iPhones iphones = new iPhones("Apple", "iPhone 14 Pro", "MQ1F3", "Deep Purple",
                62999);
        iphones.call();
        iphones.internet();
        iphones.sms();
        iphones.operationCoreiOS();

    }
}



