package com.sendmail;

import java.time.LocalDateTime;

import com.sendmail.services.SNSService;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        SNSService.sendMessage("Mensagem enviada por app Java no dia - " + LocalDateTime.now());

    }
}
