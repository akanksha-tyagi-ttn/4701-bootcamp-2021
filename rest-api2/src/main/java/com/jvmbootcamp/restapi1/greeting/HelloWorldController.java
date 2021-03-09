package com.jvmbootcamp.restapi1.greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
public class HelloWorldController {
    @Autowired
    private MessageSource messageSource;

    @GetMapping(path = "/greetNormally")
    public String greetings() {
        return "Good Morning, How are you?";
    }

    @GetMapping("/greet-internationalized")
    public String greetingInternational() {
        return messageSource.getMessage("greeting.message",
                null, LocaleContextHolder.getLocale());
    }
}

//    @GetMapping("/greet-internationalized")
//    public String helloUsername(@RequestParam String username)
//    {
//        return messageSource.getMessage("greeting.message",
//                null, LocaleContextHolder.getLocale());
//    }
//}
