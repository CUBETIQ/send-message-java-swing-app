/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cubetiqs.swing;

import com.cubetiqs.messaging.client.telegram.TelegramProvider;
import com.cubetiqs.messaging.client.telegram.TelegramConfig;

/**
 *
 * @author CUBETIQ
 */
public class SendMessageCommandLine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String token = TelegramConfig.getToken();
        String chatId = "-360594386"; // Test chat id
        TelegramProvider
                .init(token)
                .setMessage("Hi, How are you?")
                .sendToChatId(chatId)
                .send();
    }
    
}
