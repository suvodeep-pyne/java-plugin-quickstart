package org.spyne.javapluginquickstart.fooplugin;

import org.spyne.javapluginquickstart.spi.foo.Foo;
import org.spyne.javapluginquickstart.spi.foo.FooFactory;

public class FooFactoryImpl implements FooFactory {

  @Override
  public String name() {
    return "fooFactory";
  }

  @Override
  public Foo build() {
    return new FooImpl();
  }
}
