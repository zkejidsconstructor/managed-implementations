package com.zkejid.constructor.managedimplementations.impl;

import com.zkejid.constructor.core.api.v1.ConstructionException;
import com.zkejid.constructor.core.api.v1.ConstructorPart;
import com.zkejid.constructor.managedimplementations.api.v1.ImplementationFactory;
import com.zkejid.constructor.managedimplementations.api.v1.ImplementationProducer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class ConstructorPartImpl implements ConstructorPart {

  private List<ImplementationProducer<?>> producers;

  @Override
  public Set<Class<?>> getInterfacesNecessary() {
    return Collections.singleton(ImplementationProducer.class);
  }

  @Override
  public Set<Class<?>> getInterfacesProvided() {
    return Set.of(ImplementationFactory.class);
  }

  @Override
  public Object getImplementation(Class<?> anInterface) throws ConstructionException {
    if (ImplementationFactory.class.equals(anInterface)) {
      return new ImplementationFactoryImpl(producers);
    } else {
      throw new ConstructionException("Module does not provide implementation of " + anInterface);
    }
  }

  @Override
  public void putImplementation(Class<?> interfaceNecessary, Object... implementation) {
    if (ImplementationProducer.class.equals(interfaceNecessary)) {
      producers = new ArrayList<>(implementation.length);
      for (Object o : implementation) {
        producers.add((ImplementationProducer<?>) o);
      }
    }
  }

  @Override
  public void verifyNecessaryInterfaces() throws ConstructionException {
    if (producers == null) {
      throw new ConstructionException("No producers specified");
    }
  }
}
