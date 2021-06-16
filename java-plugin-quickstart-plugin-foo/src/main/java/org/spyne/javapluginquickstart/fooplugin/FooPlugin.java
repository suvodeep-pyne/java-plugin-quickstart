package org.spyne.javapluginquickstart.fooplugin;

import java.util.Arrays;
import java.util.List;
import org.spyne.javapluginquickstart.spi.Plugin;
import org.spyne.javapluginquickstart.spi.foo.FooFactory;

public class FooPlugin implements Plugin {

  @Override
  public List<FooFactory> getFooFactories() {
    return Arrays.asList(
        new FooFactoryImpl()
    );
  }
}
