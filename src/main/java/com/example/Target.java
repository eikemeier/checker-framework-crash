package com.example;

import org.immutables.value.Value;

@Value.Immutable
public interface Target {
  String getInformation();
}
