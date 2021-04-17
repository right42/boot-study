package me.right.bootstudy.config;

public class Message {

    private final String content;

    public Message(String message) {
        System.out.println("init Message");
        this.content = message;
    }

    public String getContent(){
        return this.content;
    }
}
