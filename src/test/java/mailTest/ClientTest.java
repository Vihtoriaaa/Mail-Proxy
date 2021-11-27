package mailTest;
import static org.junit.jupiter.api.Assertions.*;
import mail.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ClientTest {
    Client client;

    @BeforeEach
    void setUp() {
        client = new Client("Vika", Gender.FEMALE, 19, "shrek@yahoo.ua");
    }

    @Test
    void getName() {
        assertEquals(client.getName(), "Vika");
    }

    @Test
    void getSex() {
        assertEquals(client.getSex(), Gender.FEMALE);
    }

    @Test
    void getAge() {
        assertEquals(client.getAge(), 19);
    }

    @Test
    void getEmail() {
        assertEquals(client.getEmail(), "shrek@yahoo.ua");
    }
}
