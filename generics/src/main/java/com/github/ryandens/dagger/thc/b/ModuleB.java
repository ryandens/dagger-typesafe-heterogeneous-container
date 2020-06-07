package com.github.ryandens.dagger.thc.b;

import com.github.ryandens.dagger.thc.ServiceRegistration;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;

@Module
public final class ModuleB {

  @Provides
  @IntoSet
  static ServiceRegistration<?> provideRegistration() {
    return ServiceRegistration.of(MessageB.class, new ServiceB());
  }
}
