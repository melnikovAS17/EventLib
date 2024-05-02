package ru.melnikov.demo.gRPCtest.client;

import java.math.BigDecimal;

public class NewAccountEvent {
    private String accountId;
    private String name;
    private Integer age;
    private String greetingMessage;

    public NewAccountEvent(){}

    public NewAccountEvent(String accountId, String name, Integer age, String greetingMessage) {
        this.accountId = accountId;
        this.name = name;
        this.age = age;
        this.greetingMessage = greetingMessage;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGreetingMessage() {
        return greetingMessage;
    }

    public void setGreetingMessage(String greetingMessage) {
        this.greetingMessage = greetingMessage;
    }
}
