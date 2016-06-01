# proguard-applymapping-issue
This is a demonstration of a suspected bug in the proguard obfuscation tool.

To run the demo:
----------------
1. run ./gradlew clean proguard (on the root project)
2. observe the mapping of project 'core' -> the internal class has been renamed as expected
3. observe the mapping of project 'ext' -> the internal class has been renamed to the same name as the internal class in the 'core' project

Expected results:
-----------------
The second obfuscation run has the parameter 'applymapping' which correctly renames the references to the renamed source classes in the resulting jar.
I'm expecting the tool to rename the classes in the second obfuscation run in a way that the core jar (whose mapping has been applied) and the ext jar can be on the same classpath without name collision

Actual results:
---------------
The second obfuscation run renames a class to a name that was previously taken by a previos obfuscation run. This prevents incremental obfuscation of the core and the ext jars.
