package org.spyne.javapluginquickstart.spi.foo;

public interface FooFactory {

  String name();

  Foo build();
}
