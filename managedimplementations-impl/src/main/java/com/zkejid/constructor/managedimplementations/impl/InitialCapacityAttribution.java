package com.zkejid.constructor.managedimplementations.impl;

import com.zkejid.constructor.managedimplementations.api.v1.Attribution;

public final class InitialCapacityAttribution implements Attribution {

  private final Integer initialCapacity;

  public InitialCapacityAttribution(Integer initialCapacity) {
    this.initialCapacity = initialCapacity;
  }

  public Integer getInitialCapacity() {
    return initialCapacity;
  }
}
