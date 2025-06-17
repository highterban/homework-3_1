package com.gmail.medvediev.homeworks.homework14_1;

public class MessageRunner {
    public static void main(String[] args) {
        MessagePrinter printer = new MessagePrinter();

        Printer.Message firstMessage = new Printer.Message("Привіт!", "Олег");
        Printer.Message secondMessage = new Printer.Message("Це анонімне повідомлення", null);
        Printer.Message thirdMessage = new Printer.Message(null, null);

        printer.print(firstMessage);
        printer.print(secondMessage);
        printer.print(thirdMessage);
    }
}
