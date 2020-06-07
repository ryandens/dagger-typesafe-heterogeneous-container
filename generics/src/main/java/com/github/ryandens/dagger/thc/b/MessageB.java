package com.github.ryandens.dagger.thc.b;

/** A message specific to module B. */
public final class MessageB {

  private final String messageB;
  private final boolean enabled;

  public MessageB(String messageB, boolean enabled) {
    this.messageB = messageB;
    this.enabled = enabled;
  }

  public String messageB() {
    return messageB;
  }

  public boolean enabled() {
    return enabled;
  }
}
