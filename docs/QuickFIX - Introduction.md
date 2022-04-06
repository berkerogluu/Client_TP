# QuickFIX (Open Source Implementation of FIX Protocol)

QuickFIX is an open source FIX messaging engine written in C. It is cross-platform and runs on Windows, MacOS, Linux, BSD etc.
There three variants exists:
- QuickFIX/J, Java implementation of engine
- QuickFIX/n, C# and .NET implementation of engine
- QuickFIX/Go, Go implementation of engine

>We use QuickFIX/J in this project.

## Dependencies

**Java Runtime Machine (JVM):** JVM compatible with Oracle JRE Java 1.7.x or higher.

**Required Run-time Libraries:**

- quickfixj-core.jar
- quickfixj-msg-fix40.jar
- quickfixj-msg-fix41.jar
- quickfixj-msg-fix42.jar
- quickfixj-msg-fix43.jar
- quickfixj-msg-fix44.jar
- quickfixj-msg-fix50.jar
- quickfixj-msg-fix50sp1.jar
- quickfixj-msg-fix50sp2.jar

> or quickfixj-all.jar (includes core and message JARs)

- mina-core-2.0.16.jar (Socket Handling, Java NIO)
- slf4j-api.jar (SLF4J library for JDK logging)