package com.zkejid.constructor.managedimplementations.api.v1;

/**
 * Attribution of implementation. Developer of the {@link ImplementationProducer} defines
 * set of available and required attributions for given producer. User provides
 * the set of attributions he desires to get on implementation of requested interface.
 * Factory returns the most appropriate implementation according to given set of attributions.
 * <p>
 * Developer of the {@link ImplementationProducer} may define own implementation of attribution
 * or may reuse existing attribution according to it's semantic.
 */
public interface Attribution {
}
