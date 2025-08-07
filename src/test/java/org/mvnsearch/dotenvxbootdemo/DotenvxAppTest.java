package org.mvnsearch.dotenvxbootdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DotenvxAppTest {
    @Value("${nick}")
    private String nick;

    @Test
    public void testNick() {
        System.out.println("nick = " + nick);
    }

}
