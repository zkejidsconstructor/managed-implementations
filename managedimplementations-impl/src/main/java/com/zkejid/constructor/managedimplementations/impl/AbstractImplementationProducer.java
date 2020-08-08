package com.zkejid.constructor.managedimplementations.impl;

import com.zkejid.constructor.managedimplementations.api.v1.Attribution;
import com.zkejid.constructor.managedimplementations.api.v1.ImplementationProducer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class AbstractImplementationProducer<T> implements ImplementationProducer<T> {

  protected <R extends Attribution> R getAttribution(Class<R> clazz, Attribution ... attributions) {
    R result = null;
    for (Attribution attribution : attributions) {
      if (!clazz.isAssignableFrom(attribution.getClass())) {
        continue;
      }
      if (result == null) {
        result = clazz.cast(attribution);
      } else {
        throw new IllegalArgumentException("Found several attributions of " + clazz);
      }
    }
    throw new IllegalArgumentException("Not found required attribution of " + clazz);
  }
}
