package org.spyne.javapluginquickstart.fooplugin;

import org.spyne.javapluginquickstart.spi.foo.Foo;

public class FooImpl implements Foo {

  @Override
  public void doFoo() {
    System.out.println("I'm a foo dooer!");
  }
}
