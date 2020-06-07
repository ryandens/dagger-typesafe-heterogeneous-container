package com.github.ryandens.dagger.thc;

import com.github.ryandens.dagger.thc.a.MessageA;
import com.github.ryandens.dagger.thc.b.MessageB;

public final class Main {

  public static void main(final String[] args) {
    final var rootComponent = DaggerRootComponent.create();
    final var container = rootComponent.services();
    final var serviceA = container.get(MessageA.class);
    System.out.println(serviceA.getMessage().messageA());
    System.out.println(serviceA.getMessage().count());
    final Service<MessageB> serviceB = container.get(MessageB.class);
    System.out.println(serviceB.getMessage().messageB());
    System.out.println(serviceB.getMessage().enabled());
  }
}
