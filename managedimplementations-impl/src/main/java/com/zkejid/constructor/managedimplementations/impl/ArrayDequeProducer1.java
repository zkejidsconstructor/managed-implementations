package com.zkejid.constructor.managedimplementations.impl;

import com.zkejid.constructor.managedimplementations.api.v1.Attribution;
import com.zkejid.constructor.managedimplementations.api.v1.ImplementationProducer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public class ArrayDequeProducer1<T> extends AbstractImplementationProducer<ArrayDeque<T>> {

  @Override
  public Class<?> getInterfaceClass() {
    return Deque.class;
  }

  @Override
  public ArrayDeque<T> getImplementation(Attribution... attributions) {
    return new ArrayDeque<>();
  }

  @Override
  public List<Class<? extends Attribution>> acceptableAttributions() {
    return Collections.emptyList();
  }
}
