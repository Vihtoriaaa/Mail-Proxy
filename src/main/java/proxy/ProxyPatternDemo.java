package proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        ProxyImage image = new ProxyImage("shrek.jpg");
        image.display();
    }
}