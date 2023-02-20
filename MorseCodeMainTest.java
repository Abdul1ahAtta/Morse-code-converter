package morseConverter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MorseCodeMainTest {

    @Test
   public void test1() {

        MorseCodeConverter converter = new MorseCodeConverter();

        String code ="a";

        String actual = converter.decode(code);
        String expected = ".-";

        assertEquals(expected, actual);

    }
    @Test
    public void morseHello() {

        MorseCodeConverter converter = new MorseCodeConverter();

        String hello =".... . .-.. .-.. --- ";

        String actual = converter.morseHello(hello);
        String expected = "Hello";

        assertEquals(expected, actual);

    }
    @Test
    public void hW() {

        MorseCodeConverter converter = new MorseCodeConverter();

        String hW =".... . .-.. .-.. --- : .-- --- .-. .-.. -.. ";

        String actual = converter.morsetest(hW);
        String expected = "Hello world";

        assertEquals(expected, actual);

    }
}