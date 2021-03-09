package com.jvmbootcamp.restapi1.greeting;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
@ApiModel("Greeting class which greets in English, German and Swedish!!")
public class HelloWorldController {
    @Autowired
    private MessageSource messageSource;


    @GetMapping(path = "/greetNormally")
    @ApiOperation("greets in normal way, not specific with different languages.")
    public String greetings() {
        return "Good Morning, How are you?";
    }

    @GetMapping("/greet-internationalized")
    @ApiOperation("greets in different languages,(English,German and Swedish.. ")
    public String greetingInternational() {
        return messageSource.getMessage("greeting.message",
                null, LocaleContextHolder.getLocale());
    }


    @GetMapping("/greet-internationalized/{username}")
    public String helloUsername(@PathVariable String username)
    {
        return messageSource.getMessage("greeting.message",
                new Object[]{username}, LocaleContextHolder.getLocale());
    }
}
