package org.spyne.javapluginquickstart.fooplugin;

import org.spyne.javapluginquickstart.spi.Plugin;
import org.spyne.javapluginquickstart.spi.foo.FooFactory;

public class FooPlugin implements Plugin {

  @Override
  public Iterable<FooFactory> getFooFactories() {
    return null;
  }
}
