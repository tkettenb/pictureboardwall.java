### compile

    $ javac StackTraceExamples.java

### run it:

    $ java StackTraceExamples
    >>> first come first server -- static block is even before main. (i guess!)
    java.lang.Thread.getStackTrace(Thread.java:1559)
    StackTraceExamples.showStackTrace(StackTraceExamples.java:19)
    StackTraceExamples.<clinit>(StackTraceExamples.java:3)



    >>> from main method.
    java.lang.Thread.getStackTrace(Thread.java:1559)
    StackTraceExamples.showStackTrace(StackTraceExamples.java:19)
    StackTraceExamples.main(StackTraceExamples.java:26)



    >>> public member function
    java.lang.Thread.getStackTrace(Thread.java:1559)
    StackTraceExamples.showStackTrace(StackTraceExamples.java:19)
    StackTraceExamples.bar(StackTraceExamples.java:13)
    StackTraceExamples.main(StackTraceExamples.java:27)



    >>> inner member class function... TODO: correct terms used in this descr?
    java.lang.Thread.getStackTrace(Thread.java:1559)
    StackTraceExamples.showStackTrace(StackTraceExamples.java:19)
    StackTraceExamples$Inner.foo(StackTraceExamples.java:8)
    StackTraceExamples.bar(StackTraceExamples.java:14)
    StackTraceExamples.main(StackTraceExamples.java:27)



