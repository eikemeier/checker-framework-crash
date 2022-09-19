package com.example;

import org.immutables.value.Value;

@Value.Immutable
public abstract class Source implements WithSource {
  public abstract String getInformation();

  public final Source addInformation(String newInformation) {
    return withInformation(newInformation);
  }
}
