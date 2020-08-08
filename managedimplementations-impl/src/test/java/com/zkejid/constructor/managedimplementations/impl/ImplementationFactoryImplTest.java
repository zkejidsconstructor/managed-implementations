package com.zkejid.constructor.managedimplementations.impl;

import com.zkejid.constructor.managedimplementations.api.v1.ImplementationFactory;
import com.zkejid.constructor.managedimplementations.api.v1.test.ImplementationFactoryChecklist;
import java.util.Collections;

class ImplementationFactoryImplTest extends ImplementationFactoryChecklist {

  @Override
  public ImplementationFactory getApi() {
    return new ImplementationFactoryImpl(Collections.emptyList());
  }
}