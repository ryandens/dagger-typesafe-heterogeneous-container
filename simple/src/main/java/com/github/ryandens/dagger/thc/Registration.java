package com.github.ryandens.dagger.thc;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Registration<T> {

  public static <T> Registration<T> of(final Class<T> clazz, final T value) {
    return new AutoValue_Registration<>(clazz, value);
  }

  public abstract Class<T> clazz();

  public abstract T value();
}
