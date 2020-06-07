package com.github.ryandens.dagger.thc;

import com.github.ryandens.dagger.thc.a.ModuleA;
import com.github.ryandens.dagger.thc.b.ModuleB;
import dagger.Module;
import dagger.Provides;

import java.util.Set;

@Module(includes = {ModuleA.class, ModuleB.class})
public final class RootModule {

  @Provides
  static THCForServiceImpls provide(final Set<ServiceRegistration<?>> serviceRegistrations) {
    final var container = new THCForServiceImpls();
    serviceRegistrations.forEach(container::put);
    return container;
  }
}
