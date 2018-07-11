package com.kodilla.good.patterns.challenges;

public class MailInformationService implements InformationService{
    @Override
    public void inform(Buyer buyer) {
        System.out.println("Sending confirmation email");
    }
}
