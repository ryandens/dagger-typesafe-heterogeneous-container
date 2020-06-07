package com.github.ryandens.dagger.thc;

import dagger.Component;

@Component(modules = {RootModule.class})
public interface RootComponent {

  THCForServiceImpls services();
}
