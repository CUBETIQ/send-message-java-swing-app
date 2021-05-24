# Example Java Swing for Send Message App with Telegram
- Telegram Bot Send Message

# Example

- Send Message to Telegram Channel/Group via Bot
```java
String chatId = "TELEGRAM_CHAT_ID";
String token = "TELEGRAM_BOT_TOKEN";
String text = "Your message here";

TelegramBotUtils.sendMessage(
        chatId,
        text,
        token,
        null
);

// OR use provider

TelegramProvider
            .init(token)
            .sendToChatId(chatId)
            .setMessage(text)
            .send();

```

# Contributors
- Sombo Chea <sombochea@cubetiqs.com>