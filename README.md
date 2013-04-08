Object (or Class) interactions.

E.g. to mark an object instance to be a singleton, just markup with @Singleton.
In this case there is more to it than just an annotation.
The singleton annotation let's a "manager" know that there should only be one instance.
The "factory" module (once I republish it) has such a "manager" - this factory can be use inconjuntion with KISS IoC.

Note, this is a Java 7, Maven 3 project.