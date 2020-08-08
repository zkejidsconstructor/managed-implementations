package com.zkejid.constructor.managedimplementations.impl;

import com.zkejid.constructor.managedimplementations.api.v1.Attribution;
import com.zkejid.constructor.managedimplementations.api.v1.ImplementationProducer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListProducer3<T> extends AbstractImplementationProducer<ArrayList<T>> {

  @Override
  public Class<?> getInterfaceClass() {
    return List.class;
  }

  @Override
  public ArrayList<T> getImplementation(Attribution... attributions) {
    final CollectionCopyAttribution attribution =
        getAttribution(CollectionCopyAttribution.class, attributions);
    final Collection<T> collectionCopy = attribution.getCollection();
    return new ArrayList<>(collectionCopy);
  }

  @Override
  public List<Class<? extends Attribution>> acceptableAttributions() {
    return Collections.singletonList(CollectionCopyAttribution.class);
  }
}
