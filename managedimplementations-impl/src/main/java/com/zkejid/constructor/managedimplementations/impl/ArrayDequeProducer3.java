package com.zkejid.constructor.managedimplementations.impl;

import com.zkejid.constructor.managedimplementations.api.v1.Attribution;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public class ArrayDequeProducer3<T> extends AbstractImplementationProducer<ArrayDeque<T>> {

  @Override
  public Class<?> getInterfaceClass() {
    return Deque.class;
  }

  @Override
  public ArrayDeque<T> getImplementation(Attribution... attributions) {
    final CollectionCopyAttribution attribution =
        getAttribution(CollectionCopyAttribution.class, attributions);
    return new ArrayDeque<>(attribution.getCollection());
  }

  @Override
  public List<Class<? extends Attribution>> acceptableAttributions() {
    return Collections.singletonList(CollectionCopyAttribution.class);
  }
}
