package com.github.ryandens.dagger.thc;

import java.util.HashMap;

public final class THCForServiceImpls {

  private final HashMap<Class<?>, Object> keyObjectHashMap;

  public THCForServiceImpls() {
    keyObjectHashMap = new HashMap<>();
  }

  public <T> void put(final ServiceRegistration<T> serviceRegistration) {
    keyObjectHashMap.put(serviceRegistration.clazz(), serviceRegistration.value());
  }

  public <T> Service<T> get(final Class<T> clazz) {
      @SuppressWarnings("unchecked")
      final var service = (Service<T>) keyObjectHashMap.get(clazz);
      return service;
  }
}
