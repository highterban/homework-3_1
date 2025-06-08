package com.gmail.medvediev.homeworks.homework14_1;

public class MessageRunner {
    public static void main(String[] args) {
        MessagePrinter printer = new MessagePrinter();

        Printer.Message msg1 = new Printer.Message("Привіт!", "Олег");
        Printer.Message msg2 = new Printer.Message("Це анонімне повідомлення", null);
        Printer.Message msg3 = new Printer.Message(null, null);

        printer.print(msg1);
        printer.print(msg2);
        printer.print(msg3);
    }
}
