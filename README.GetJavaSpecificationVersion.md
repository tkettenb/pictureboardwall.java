### Hibernate validation exception

Do'oh -- one of our applications failed with an `IndexOutOfBoundsExcetpion`

	✗ java -jar target/consistency-checker-1.10.0-SNAPSHOT.jar --orderid 123412312312 test-config.yml
	[2018-11-23 15:26:02] [INFO ] [Version:17] - HV000001: Hibernate Validator 5.2.2.Final
	Exception in thread "main" javax.validation.ValidationException: Unable to instantiate Configuration.
			at javax.validation.Validation$GenericBootstrapImpl.configure(Validation.java:279)
			at javax.validation.Validation.buildDefaultValidatorFactory(Validation.java:110)
			at c.App.validateConfigurationProperties(App.java:162)
			at c.App.main(App.java:109)
	Caused by: java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
			at org.hibernate.validator.internal.util.Version.getJavaRelease(Version.java:36)
			at org.hibernate.validator.internal.engine.ConfigurationImpl.<init>(ConfigurationImpl.java:120)
			at org.hibernate.validator.internal.engine.ConfigurationImpl.<init>(ConfigurationImpl.java:96)
			at org.hibernate.validator.HibernateValidator.createGenericConfiguration(HibernateValidator.java:31)
			at javax.validation.Validation$GenericBootstrapImpl.configure(Validation.java:276)
			... 3 more


It fails in:

	package org.hibernate.validator.internal.util;

	import org.hibernate.validator.internal.util.logging.LoggerFactory;

	public final class Version {

	  //...

	  public static int getJavaRelease() {
		String[] specificationVersion = System.getProperty("java.specification.version").split("\\.");
		return Integer.parseInt(specificationVersion[1]);  // << Causes ArrayIndexOutOfBoundsException on OpenJDK 11
	  }



### OpenJDK 11 compared to JDK 8

	✗ javac GetJavaSpecificationVersion.java 
	✗ java GetJavaSpecificationVersion 
	11
	✗ java -version
	openjdk version "11.0.1" 2018-10-16
	OpenJDK Runtime Environment 18.9 (build 11.0.1+13)
	OpenJDK 64-Bit Server VM 18.9 (build 11.0.1+13, mixed mode)
	✗ source ~/java18 
	✗ java GetJavaSpecificationVersion
	Error: A JNI error has occurred, please check your installation and try again
	Exception in thread "main" java.lang.UnsupportedClassVersionError: GetJavaSpecificationVersion has been compiled by a more recent version of the Java Runtime (class file version 55.0), this version of the Java Runtime only recognizes class file versions up to 52.0
		at java.lang.ClassLoader.defineClass1(Native Method)
		at java.lang.ClassLoader.defineClass(ClassLoader.java:763)
		at java.security.SecureClassLoader.defineClass(SecureClassLoader.java:142)
		at java.net.URLClassLoader.defineClass(URLClassLoader.java:467)
		at java.net.URLClassLoader.access$100(URLClassLoader.java:73)
		at java.net.URLClassLoader$1.run(URLClassLoader.java:368)
		at java.net.URLClassLoader$1.run(URLClassLoader.java:362)
		at java.security.AccessController.doPrivileged(Native Method)
		at java.net.URLClassLoader.findClass(URLClassLoader.java:361)
		at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
		at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:338)
		at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
		at sun.launcher.LauncherHelper.checkAndLoadMain(LauncherHelper.java:495)
	✗ javac GetJavaSpecificationVersion.java
	✗ java GetJavaSpecificationVersion      
	1.8
	✗ java -version                         
	java version "1.8.0_152"
	Java(TM) SE Runtime Environment (build 1.8.0_152-b16)
	Java HotSpot(TM) 64-Bit Server VM (build 25.152-b16, mixed mode)


### Conclusion

Only has single number version in 'java.specification.version'

