package com.zkejid.constructor.managedimplementations.api.v1;

import java.util.List;

public interface ImplementationProducer<T> {

  Class<?> getInterfaceClass();

  T getImplementation(Attribution ... attributions);

  List<Class<? extends Attribution>> acceptableAttributions();
}
