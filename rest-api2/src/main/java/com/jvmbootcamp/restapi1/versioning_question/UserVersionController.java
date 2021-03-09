package com.jvmbootcamp.restapi1.versioning_question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserVersionController {
    @GetMapping("/displayVersion1")
    public UserVersion1 displayPerson1()
    {
        return new UserVersion1("rahul","gandhi");
    }

    @GetMapping("/displayVersion2")
    public UserVersion2 displayPerson2()
    {
        return new UserVersion2("rahul","gandhi",45,"iamrahulgandhu@gmail.com"
                ,85479,"India");
    }


    //request parameter
    @GetMapping(value = "/person/param", params = "version=1")
    public UserVersion1 displayViaParam1() {
        return new UserVersion1("Narendra","Modi");
    }

    @GetMapping(value = "/person/param", params = "version=2")
    public UserVersion2 displayViaParam2(){
        return new UserVersion2("Narendra","Modi",65,
                "hindustan@gmail.com"
                ,412579,"Hindustan");
    }


    //headers
    @GetMapping(value = "/person/header", headers = "USER-PERSON=1")
    public UserVersion1 headerV1() {
        return new UserVersion1("Mamta","Benerjee");
    }

    @GetMapping(value = "/person/header", headers = "USER-PERSON=2")
    public UserVersion2 headerV2() {
        return new UserVersion2("Mamta","Benerjee",50,
                "didi_kolkata@gmail.com"
                ,441779,"Kolkata_India");
    }

    //mime type versioning
    @GetMapping(value = "/person/mimeType", produces = "application/vnd.company.app-v1+json")
    public UserVersion1 producesV1() {
        return new UserVersion1("Amit","Shah");
    }

    @GetMapping(value = "/person/mimeType", produces = "application/vnd.company.app-v2+json")
    public UserVersion2 producesV2() {
        return new UserVersion2("Amit","Shah",60,
                "mandir.wahi.banega@gmail.com"
                ,400009,"India");
    }
}
