package com.service;
import com.domain.Orders;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class EmailServiceTest {
    static EmailService objEmailService;
    String itemName="MacBook";
    int quantity=1;
    double price=156050d;
    @BeforeAll
    static void setUp() {
        objEmailService=EmailService.getInstance();
    }
    @Test
    void testSingletonObject_True(){
        assertSame(EmailService.getInstance(),objEmailService);
        // both should be same
    }

    @Test
    void testSingletonObject_False(){
        //it will fail
        assertSame(EmailService.getInstance(),new EmailService());
    }
    @Test
    void checkSendEmail() {
        //given
        Orders orderObj=new Orders();
        orderObj.setItemName(itemName)
                .setPrice(price)
                .setQuantity(1);
        //when
        Executable executable=()->objEmailService.sendEmail(orderObj);

        //then
        assertThrows(RuntimeException.class,executable);
    }

    @ParameterizedTest
    @CsvSource(value={"12,Watches,25000,email-successful",
            "2,Television,105000, email-successful",
            "1,Apple-Iphone,50000, email-successful"})
    void testSendEmailTrue(int quantity,String itemName,double price,String emailMsg){
        Orders objOrder=new Orders();
        objOrder.setQuantity(quantity)
                .setItemName(itemName)
                .setPrice(price);
        assertTrue(objEmailService.sendEmail(objOrder,emailMsg));
    }

    @ParameterizedTest
    @CsvSource(value={"1, Laptop, 70000, Sent-UnSuccessfully"})
    public void testSendEmail_False(int quantity, String item_name, double price, String email) {
        //given
        Orders order = new Orders();
        order.setQuantity(quantity).setItemName(item_name).setPrice(price);
        String cc = email;
        //when
        boolean result = objEmailService.sendEmail(order, cc);
        assertFalse(result);
    }
}