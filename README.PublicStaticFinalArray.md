# Override Array items

Example runs:

        ✗ java PublicStaticFinalArray 
            1  connection_timeout=60
            2  tcp_port=8080
        ✗ java PublicStaticFinalArray "horst=3" "udo=8"
            1  horst=3
            2  udo=8
        ✗ java PublicStaticFinalArray "horst=3" "udo=8" "too much, IndexOutOfBounds?"
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 2
            at PublicStaticFinalArray.main(PublicStaticFinalArray.java:20)
        ✗ java PublicStaticFinalArray "horst=3"                                      
            1  horst=3
            2  tcp_port=8080

