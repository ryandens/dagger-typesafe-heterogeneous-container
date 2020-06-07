package com.github.ryandens.dagger.thc.b;

import com.github.ryandens.dagger.thc.Service;

final class ServiceB implements Service<MessageB> {

  @Override
  public MessageB getMessage() {
    return new MessageB("Hello from service B!", true);
  }
}
