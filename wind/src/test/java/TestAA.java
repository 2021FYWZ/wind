import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.junit.Test;

import java.security.Key;

public class TestAA {


    @Test
    public void test() {
        Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
        System.out.println(key);
    }
}
