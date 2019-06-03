
### aspect ratio's of screen resolutions

Python (python3) fractions are automatically shortened (canceled?), eg:

    ✗ python3
    Python 3.7.3 (default, Mar 27 2019, 09:23:15) 
    [Clang 10.0.1 (clang-1001.0.46.3)] on darwin
    Type "help", "copyright", "credits" or "license" for more information.
    >>> import fractions
    >>> fractions.Fraction(1,3)
    Fraction(1, 3)
    >>> fractions.Fraction(3,9)
    Fraction(1, 3)
    >>> fractions.Fraction(1280,720)
    Fraction(16, 9)
    >>> fractions.Fraction(1920,1080)
    Fraction(16, 9)
    >>> fractions.Fraction(1920,120)
    Fraction(16, 1)
    >>> fractions.Fraction(1920,1200)
    Fraction(8, 5)
    >>> fractions.Fraction(2048,1080)
    Fraction(256, 135)
    >>> fractions.Fraction(2560,1440)
    Fraction(16, 9)
    >>> fractions.Fraction(3840,2160)
    Fraction(16, 9)
    >>> fractions.Fraction(4096,2160)
    Fraction(256, 135)
    >>> fractions.Fraction(3840,2160)
    Fraction(16, 9)
    >>> fractions.Fraction(5120,2880)
    Fraction(16, 9)


(screen resoultions from: https://www.tomshardware.com/reviews/what-is-hd,5745.html)

