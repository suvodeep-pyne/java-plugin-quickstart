package org.spyne.javapluginquickstart.spi;

import java.util.Collections;
import java.util.List;
import org.spyne.javapluginquickstart.spi.foo.FooFactory;

public interface Plugin {

  default List<FooFactory> getFooFactories() {
    return Collections.emptyList();
  }
}
