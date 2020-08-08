package com.zkejid.constructor.managedimplementations.impl;

import com.zkejid.constructor.managedimplementations.api.v1.Attribution;
import java.util.Collection;

public final class CollectionCopyAttribution implements Attribution {

  private final Collection<?> collection;

  public CollectionCopyAttribution(Collection<?> collection) {
    this.collection = collection;
  }

  public <T> Collection<T> getCollection() {
    //noinspection unchecked
    return (Collection<T>) collection;
  }
}
