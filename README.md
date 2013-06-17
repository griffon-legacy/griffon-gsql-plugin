
Groovy SQL support
------------------

Plugin page: [http://artifacts.griffon-framework.org/plugin/gsql](http://artifacts.griffon-framework.org/plugin/gsql)


The GSQL plugin enables lightweight access multiple SQL datasources.
This plugin does NOT provide domain classes nor dynamic finders like GORM does.

Usage
-----
Upon installation the plugin will generate the following artifacts in
`$appdir/griffon-app/conf`:

 * BootstrapGsql.groovy - defines init/destroy hooks for data to be manipulated
   during app startup/shutdown.

This plugin relies on the facilities exposed by the [datasource][1] plugin.

### Multiple Databases

The plugin expects a class `BootstrapGsql_<datasourcename>` to be available in
the classpath. The default `BootstrapGsql` class will be used if the former
could not be found.

### Example

A trivial sample application can be found at
[https://github.com/aalmiray/griffon_sample_apps/tree/master/persistence/gsql][2]


[1]: /plugin/datasource 
[2]: https://github.com/aalmiray/griffon_sample_apps/tree/master/persistence/gsql

### Building

This project requires all of its dependencies be available from maven compatible repositories.
Some of these dependencies have not been pushed to the Maven Central Repository, however you
can obtain them from [lombok-dev-deps][lombok-dev-deps].

Follow the instructions found there to install the required dependencies into your local Maven
repository before attempting to build this plugin.

[lombok-dev-deps]: https://github.com/aalmiray/lombok-dev-deps