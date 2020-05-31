package com.github.ryandens.dagger.thc.a;

import com.github.ryandens.dagger.thc.Registration;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;

@Module
public final class ModuleA {

  @Provides
  @IntoSet
  static Registration<?> provideRegistration() {
    return Registration.of(ServiceA.class, new ServiceA());
  }
}
