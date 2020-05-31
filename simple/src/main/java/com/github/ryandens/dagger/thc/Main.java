package com.github.ryandens.dagger.thc;

import com.github.ryandens.dagger.thc.a.ServiceA;
import com.github.ryandens.dagger.thc.b.ServiceB;

public final class Main {

  public static void main(final String[] args) {
    final var rootComponent = DaggerRootComponent.create();
    final var container = rootComponent.container();
    final var serviceA = container.get(ServiceA.class);
    System.out.println(serviceA.customServiceAMessage());
    final ServiceB serviceB = container.get(ServiceB.class);
    System.out.println(serviceB.customServiceBMessage());
  }
}
