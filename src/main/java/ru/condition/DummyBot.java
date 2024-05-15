package ru.condition;

public class DummyBot {

    public static String answer(String question) {
        String rsl = "See you later.";
        if ("Hi, Bot.".equals(question)) {
            rsl = "Hi, SmartAss.";
        } else if ("Can you add two plus two?".equals(question)) {
            rsl = "I don't know. Please, ask another question.";
        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl = DummyBot.answer("Hi, Bot.");
        System.out.println(rsl);
        rsl = DummyBot.answer("Can you add two plus two?");
        System.out.println(rsl);
    }
}

