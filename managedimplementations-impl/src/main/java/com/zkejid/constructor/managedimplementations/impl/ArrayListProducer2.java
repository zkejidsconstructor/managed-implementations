package com.zkejid.constructor.managedimplementations.impl;

import com.zkejid.constructor.managedimplementations.api.v1.Attribution;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListProducer2<T> extends AbstractImplementationProducer<ArrayList<T>> {

  @Override
  public Class<?> getInterfaceClass() {
    return List.class;
  }

  @Override
  public ArrayList<T> getImplementation(Attribution... attributions) {
    final InitialCapacityAttribution attribution =
        getAttribution(InitialCapacityAttribution.class, attributions);
    return new ArrayList<>(attribution.getInitialCapacity());
  }

  @Override
  public List<Class<? extends Attribution>> acceptableAttributions() {
    return Collections.singletonList(InitialCapacityAttribution.class);
  }
}
