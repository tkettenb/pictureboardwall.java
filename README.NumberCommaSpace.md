== examples:

    $ java NumberCommaSpaceMatcher a b c "123" ",3,4" "  " "3 5 6" "3,6,7" "3,,5,6"
    123  matches  regex: ^\d+([,\s]+\d+)*
    3 5 6  matches  regex: ^\d+([,\s]+\d+)*
    3,6,7  matches  regex: ^\d+([,\s]+\d+)*
    3,,5,6  matches  regex: ^\d+([,\s]+\d+)*

