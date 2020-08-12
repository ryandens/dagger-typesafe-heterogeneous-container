package com.github.ryandens.dagger.thc.b;

import com.github.ryandens.dagger.thc.Registration;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;

@Module
public final class ModuleB {

  @Provides
  @IntoSet
  static Registration<?> provideRegistration(final ServiceB serviceB) {
    return Registration.of(ServiceB.class, serviceB);
  }
}
