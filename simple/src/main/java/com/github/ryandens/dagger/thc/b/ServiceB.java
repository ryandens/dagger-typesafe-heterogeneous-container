package com.github.ryandens.dagger.thc.b;

import javax.inject.Inject;

public final class ServiceB {

  @Inject
  ServiceB() {}

  public String customServiceBMessage() {
    return "Hello from service B!";
  }
}
