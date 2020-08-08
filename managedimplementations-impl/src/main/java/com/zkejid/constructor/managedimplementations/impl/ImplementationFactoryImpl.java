package com.zkejid.constructor.managedimplementations.impl;

import com.zkejid.constructor.managedimplementations.api.v1.Attribution;
import com.zkejid.constructor.managedimplementations.api.v1.ImplementationFactory;
import com.zkejid.constructor.managedimplementations.api.v1.ImplementationProducer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImplementationFactoryImpl implements ImplementationFactory {

  private final Map<Class<?>, List<ImplementationProducer<?>>> implementationMapping = new HashMap<>();

  public ImplementationFactoryImpl(List<ImplementationProducer<?>> producers) {
    for (ImplementationProducer<?> producer : producers) {
      implementationMapping.computeIfAbsent(
          producer.getInterfaceClass(), (c) -> new ArrayList<>()
      ).add(producer);
    }
  }

  @Override
  public <T> T getImplementation(String callCode, Class<T> clazz, Attribution... attributions) {
    final List<ImplementationProducer<?>> producers = implementationMapping.get(clazz);
    if (producers == null) {
      return null;
    } else {
      for (ImplementationProducer<?> producer : producers) {
        if (match(attributions, producer.acceptableAttributions())) {
          // first acceptable producer
          //noinspection unchecked
          return (T) producer.getImplementation(attributions);
        }
      }
    }
    throw new IllegalArgumentException("No producers for given set of attributions");
  }

  private boolean match(
      Attribution[] requestedAttributions,
      List<Class<? extends Attribution>> existingAttributions) {
    // naive realization: looking for first full match
    for (Attribution attribution : requestedAttributions) {
      if (!existingAttributions.contains(attribution.getClass())) {
        return false;
      }
    }
    return true;
  }
}
