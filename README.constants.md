### Example from https://en.wikipedia.org/wiki/Constant_interface

Compile

    $ javac constants/Constants.java
    $ javac constants/Calculations.java

Run

    $ java constants.Calculations 
    PI is 3.0

### Conclusion

Actually, this is the way to go for declaring static global variables -
prefer this to the public interface approach. But it can still lead to
confusion, as shown here.

For more details look at the wikipedia article.

