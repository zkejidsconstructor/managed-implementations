package com.zkejid.constructor.managedimplementations.api.v1.test;

import com.zkejid.constructor.managedimplementations.api.v1.ImplementationFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * The list of checks. Each implementation of {@link ImplementationFactory} should pass
 * given checks to match requirements of the API.
 */
public abstract class ImplementationFactoryChecklist {

  public abstract ImplementationFactory getApi();

  @DisplayName("Test itself is able to create implementation")
  @Test
  void _testIsWorking() {
    final ImplementationFactory implementationFactory = getApi();

    Assertions.assertNotNull(implementationFactory, "Expect not null value");
  }
}
