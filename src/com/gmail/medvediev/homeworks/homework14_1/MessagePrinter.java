package com.gmail.medvediev.homeworks.homework14_1;

public class MessagePrinter implements Printer {

    @Override
    public void print(Message message) {
        boolean textBlank = isBlank(message.getText());
        boolean senderBlank = isBlank(message.getSender());

        if (textBlank && senderBlank) {
            Printer emptyHandler = new Printer() {
                @Override
                public void print(Message msg) {
                    System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                }
            };
            emptyHandler.print(message);

        } else if (senderBlank) {
            System.out.println("Анонімний користувач відправив повідомлення: " + message.getText());
        } else {
            System.out.println("Користувач " + message.getSender() + " відправив повідомлення: " + message.getText());
        }
    }

    private boolean isBlank(String text) {
        return text == null || text.isEmpty();
    }
}
