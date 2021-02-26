package com.service;
import com.domain.Orders;

public class EmailService {
    private static EmailService instance;

    public EmailService() {}

    public static EmailService getInstance() {
        if(instance == null) {
            instance = new EmailService();
        }
        return instance;
    }

    void sendEmail(Orders order) {
        // implementation goes here
        throw new RuntimeException();
    }

    boolean sendEmail(Orders order, String cc) {
        // implementation goes here
        return true;
    }
}
