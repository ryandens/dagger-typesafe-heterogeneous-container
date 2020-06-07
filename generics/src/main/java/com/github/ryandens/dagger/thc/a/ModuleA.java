package com.github.ryandens.dagger.thc.a;

import com.github.ryandens.dagger.thc.ServiceRegistration;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;

@Module
public final class ModuleA {

  @Provides
  @IntoSet
  static ServiceRegistration<?> provideRegistration() {
    return ServiceRegistration.of(MessageA.class, new ServiceA());
  }
}
