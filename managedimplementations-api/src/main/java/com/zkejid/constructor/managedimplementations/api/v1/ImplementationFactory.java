package com.zkejid.constructor.managedimplementations.api.v1;

/**
 * Factory provides implementations of interfaces requested according to given set of
 * attributions.
 */
public interface ImplementationFactory {

  /**
   *
   * <p>
   * There is no guarantee that actual implementation returned would follow to set of attributions
   * specified.
   *
   * @param callCode
   * @param clazz
   * @param attributions
   * @param <T>
   * @return
   */
  <T> T getImplementation(String callCode, Class<T> clazz, Attribution ... attributions);
}
