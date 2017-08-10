package com.jpassion.lambdas;

@FunctionalInterface
public interface MyFunctionalInterface<T, U, V> {
	T createObject(U u, V v);
}
