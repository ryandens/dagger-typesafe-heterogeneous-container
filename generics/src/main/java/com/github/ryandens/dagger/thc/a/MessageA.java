package com.github.ryandens.dagger.thc.a;

/**
 * A message specific to module A.
 */
public final class MessageA {

    private final String messageA;
    private final int count;

    public MessageA(String messageA, int count) {
        this.messageA = messageA;
        this.count = count;
    }

    public String messageA() {
        return messageA;
    }

    public int count() {
        return count;
    }
}
