package org.spyne.javapluginquickstart.core;

import java.io.File;
import org.spyne.javapluginquickstart.spi.foo.Foo;
import org.spyne.javapluginquickstart.spi.foo.FooFactory;

/**
 * Launcher for javapluginquickstart
 */
public class App {

  public static void main(String[] args) {
    new App().run(args);
  }

  public void run(final String[] args) {
    System.out.println("Hello World!");

    String pluginsPath = "plugins";
    if (args.length > 0) {
      pluginsPath = args[0];
    }

    PluginLoader pluginLoader = new PluginLoader(new File(pluginsPath));
    pluginLoader.loadPlugins();

    FooFactory f = pluginLoader.getFooFactory("foo");
    if (f == null) {
      System.err.println("No factories loaded!");
      return;
    }

    System.out.println("This is running from the plugin");
    final Foo foo = f.build();
    foo.doFoo();
  }
}
