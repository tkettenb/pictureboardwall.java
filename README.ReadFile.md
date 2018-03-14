
### Compile

My env seems to be broken / incomplete. I have to specifiy the source file encoding:

    ✗ LC_CTYPE=UTF-8 javac ReadFile.java

or

    ✗ javac -encoding UTF-8 ReadFile.java

Without those, `javac` prints some message like:

        ✗ javac ReadFile.java 
        ReadFile.java:27: error: unmappable character for encoding ASCII
                ??? java ReadFile blah
                ^
### Example runs:

        ✗ java ReadFile                         
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
            at ReadFile.main(ReadFile.java:15)

        ✗ java ReadFile blah                    
        Exception in thread "main" java.lang.IllegalArgumentException: URI is not absolute
            at java.io.File.<init>(File.java:416)
            at ReadFile.main(ReadFile.java:18)
        ✗ java ReadFile /var/tmp/test.txt       
        Exception in thread "main" java.lang.IllegalArgumentException: URI is not absolute
            at java.io.File.<init>(File.java:416)
            at ReadFile.main(ReadFile.java:18)
        ✗ java ReadFile file:///var/tmp/test.txt
        Hi there!
        ✗ java ReadFile file:/var/tmp/test.txt
        Hi there!

        ✗ java ReadFile -
        Hello.
        Hello.
        <ctrl+d><enter>

