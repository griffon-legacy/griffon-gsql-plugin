/*
 * Copyright 2009-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the 'License');
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an 'AS IS' BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Andres Almiray
 */
class GsqlGriffonPlugin {
    // the plugin version
    String version = '1.1.0'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '1.2.0 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [datasource: '1.0.0']
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'Apache Software License 2.0'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = []
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-gsql-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = 'Groovy SQL support'
    String description = '''
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
'''
}
