package org.spyne.javapluginquickstart.spi;

import java.util.Collections;
import org.spyne.javapluginquickstart.spi.foo.FooFactory;

public interface Plugin {

  default Iterable<FooFactory> getFooFactories() {
    return Collections.emptyList();
  }
}
