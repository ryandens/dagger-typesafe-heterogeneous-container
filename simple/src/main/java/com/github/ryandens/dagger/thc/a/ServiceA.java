package com.github.ryandens.dagger.thc.a;

import javax.inject.Inject;

public final class ServiceA {

  @Inject
  ServiceA() {}

  public String customServiceAMessage() {
    return "Hello from service A!";
  }
}
