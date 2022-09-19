package com.example;

import org.mapstruct.Mapper;

@Mapper
public abstract class SourceToTargetMapper {
  public abstract Target map(Source source);
}
