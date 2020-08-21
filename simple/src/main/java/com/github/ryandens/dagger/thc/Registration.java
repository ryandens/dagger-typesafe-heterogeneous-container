package com.github.ryandens.dagger.thc;

public record Registration<T>(Class<T> clazz, T value) {
}
