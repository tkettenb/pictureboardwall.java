#### Simple example

    $ java -classpath . GetResourceAsStream GetResourceAsStream GetResourceAsStream.class Object UnknowStuff README.md         
class.path := null
GetResourceAsStream := null
GetResourceAsStream.class := java.io.BufferedInputStream@4e25154f
Object := null
UnknowStuff := null
README.md := java.io.BufferedInputStream@70dea4e


*Same without `-classpath`*

    $ java GetResourceAsStream GetResourceAsStream GetResourceAsStream.class Object UnknowStuff README.md 
class.path := null
GetResourceAsStream := null
GetResourceAsStream.class := java.io.BufferedInputStream@4e25154f
Object := null
UnknowStuff := null
README.md := java.io.BufferedInputStream@70dea4e

