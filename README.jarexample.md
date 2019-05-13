
### also see: baeldung...

➜  pictureboardwall.java git:(master) ✗ javac jarexample/Main.java 

➜  pictureboardwall.java git:(master) ✗ 
➜  pictureboardwall.java git:(master) ✗ jar cvf jarexample.jar jarexample 
added manifest
adding: jarexample/(in = 0) (out= 0)(stored 0%)
adding: jarexample/META-INF/(in = 0) (out= 0)(stored 0%)
adding: jarexample/META-INF/MANIFEST.MF(in = 51) (out= 51)(deflated 0%)
adding: jarexample/Main.java(in = 154) (out= 117)(deflated 24%)
adding: jarexample/Main.class(in = 437) (out= 300)(deflated 31%)
➜  pictureboardwall.java git:(master) ✗ ls -lt jarexample.jar 
-rw-r--r--  1 tkettenb  staff  1440 May 13 08:29 jarexample.jar
➜  pictureboardwall.java git:(master) ✗ java -jar jarexample.jar 
no main manifest attribute, in jarexample.jar
➜  pictureboardwall.java git:(master) ✗ java -cp jarexample.jar jarexample.Main
jarexample Main running.
➜  pictureboardwall.java git:(master) ✗ cat jarexample/META-INF/MANIFEST.MF 
Manifest-Version: 1.0
Main-Class: jarexample.Main

➜  pictureboardwall.java git:(master) ✗ rm jarexample.jar 
➜  pictureboardwall.java git:(master) ✗ jar cvmf jarexample/META-INF/MANIFEST.MF jarexample.jar jarexample  
added manifest
adding: jarexample/(in = 0) (out= 0)(stored 0%)
adding: jarexample/META-INF/(in = 0) (out= 0)(stored 0%)
adding: jarexample/META-INF/MANIFEST.MF(in = 51) (out= 51)(deflated 0%)
adding: jarexample/Main.java(in = 154) (out= 117)(deflated 24%)
adding: jarexample/Main.class(in = 437) (out= 300)(deflated 31%)
➜  pictureboardwall.java git:(master) ✗ java -jar jarexample.jar                            
jarexample Main running.


https://www.baeldung.com/java-jar-executable-manifest-main-class



### wtf? (Main-Class is omitted, when not passed via: `jar cvmf`

➜  pictureboardwall.java git:(master) ✗ mkdir b
➜  pictureboardwall.java git:(master) ✗ cd b
➜  b git:(master) ✗ jar xvf ../jarexample.jar 
  created: META-INF/
 inflated: META-INF/MANIFEST.MF
  created: jarexample/
  created: jarexample/META-INF/
 inflated: jarexample/META-INF/MANIFEST.MF
 inflated: jarexample/Main.java
 inflated: jarexample/Main.class
➜  b git:(master) ✗ cd ..
➜  pictureboardwall.java git:(master) ✗ jar cvf jarexample.jar jarexample                                 
added manifest
adding: jarexample/(in = 0) (out= 0)(stored 0%)
adding: jarexample/META-INF/(in = 0) (out= 0)(stored 0%)
adding: jarexample/META-INF/MANIFEST.MF(in = 51) (out= 51)(deflated 0%)
adding: jarexample/Main.java(in = 154) (out= 117)(deflated 24%)
adding: jarexample/Main.class(in = 437) (out= 300)(deflated 31%)
➜  pictureboardwall.java git:(master) ✗ mkdir a
➜  pictureboardwall.java git:(master) ✗ cd a
➜  a git:(master) ✗ jar xvf ../jarexample.jar        
  created: META-INF/
 inflated: META-INF/MANIFEST.MF
  created: jarexample/
  created: jarexample/META-INF/
 inflated: jarexample/META-INF/MANIFEST.MF
 inflated: jarexample/Main.java
 inflated: jarexample/Main.class
➜  a git:(master) ✗ cd ..
➜  pictureboardwall.java git:(master) ✗ diff -urw a b
diff -urw a/META-INF/MANIFEST.MF b/META-INF/MANIFEST.MF
--- a/META-INF/MANIFEST.MF	2019-05-13 08:34:04.000000000 +0200
+++ b/META-INF/MANIFEST.MF	2019-05-13 08:32:26.000000000 +0200
@@ -1,3 +1,4 @@
 Manifest-Version: 1.0
+Main-Class: jarexample.Main
 Created-By: 11.0.1 (Oracle Corporation)
 
➜  pictureboardwall.java git:(master) ✗ cat jarexample/META-INF/MANIFEST.MF 
Manifest-Version: 1.0
Main-Class: jarexample.Main

➜  pictureboardwall.java git:(master) ✗ cat a/META-INF/MANIFEST.MF 
Manifest-Version: 1.0
Created-By: 11.0.1 (Oracle Corporation)

➜  pictureboardwall.java git:(master) ✗ cat b/META-INF/MANIFEST.MF 
Manifest-Version: 1.0
Main-Class: jarexample.Main
Created-By: 11.0.1 (Oracle Corporation)

