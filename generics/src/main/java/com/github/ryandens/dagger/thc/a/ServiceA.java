package com.github.ryandens.dagger.thc.a;

import com.github.ryandens.dagger.thc.Service;

final class ServiceA implements Service<MessageA> {

  @Override
  public MessageA getMessage() {
    return new MessageA("Hello from service A!", 5);
  }
}
