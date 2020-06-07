package com.github.ryandens.dagger.thc;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class ServiceRegistration<T> {

  public static <T> ServiceRegistration<T> of(final Class<T> clazz, final Service<T> value) {
    return new AutoValue_ServiceRegistration<>(clazz, value);
  }

  public abstract Class<T> clazz();

  public abstract Service<T> value();
}
