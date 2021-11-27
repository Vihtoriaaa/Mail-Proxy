package proxyTest;
import proxy.ProxyImage;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


class ImageTest {
    ProxyImage proxyImage = new ProxyImage("shrek.jpg");
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void display() {
        proxyImage.display();
        assertEquals(outputStreamCaptor.toString().trim(), "shrek.jpg was loaded from disk\nshrek.jpg was turned into RealImage");
    }
}
