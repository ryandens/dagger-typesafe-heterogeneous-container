package com.github.ryandens.dagger.thc;

import java.util.HashMap;

public final class TypesafeHeterogeneousContainer {

  private final HashMap<Class<?>, Object> keyObjectHashMap;

  public TypesafeHeterogeneousContainer() {
    keyObjectHashMap = new HashMap<>();
  }

  public <T> void put(final Registration<T> registration) {
    keyObjectHashMap.put(registration.key(), registration.value());
  }

  public <T> T get(final Class<T> clazz) {
    return clazz.cast(keyObjectHashMap.get(clazz));
  }
}
