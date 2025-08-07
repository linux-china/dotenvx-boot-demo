package org.mvnsearch.dotenvxbootdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortalController {
    @Value("${nick}")
    private String nick;

    @GetMapping("/")
    public String index() {
        return "Hello, " + nick + "!";
    }
}
