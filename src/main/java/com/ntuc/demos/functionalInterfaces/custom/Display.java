package com.ntuc.demos.functionalInterfaces.custom;

/**
 *
 * @author Sridhar Guzzu
 */
@FunctionalInterface
public interface Display<T> {
T show(T x, T y);
}
