package com.zkejid.constructor.managedimplementations.impl;

import com.zkejid.constructor.managedimplementations.api.v1.Attribution;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListProducer1<T> extends AbstractImplementationProducer<ArrayList<T>> {

  @Override
  public Class<?> getInterfaceClass() {
    return List.class;
  }

  @Override
  public ArrayList<T> getImplementation(Attribution... attributions) {
    return new ArrayList<>();
  }

  @Override
  public List<Class<? extends Attribution>> acceptableAttributions() {
    return Collections.emptyList();
  }
}
