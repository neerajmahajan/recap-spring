# recap-spring
```
Spring 1.0  ------>  2004
Spring 2.0  ------>  2006
  --  Simplified XML Config
Spring 2.5  ------>  2007
  --  Annotation Config
Spring 3.0  ------>  2010 - 2012
    Spring 3.2  ------>  2012
      --  Support for Java7, Hibernate, Servlet 3.0
      --  Required Java 1.5+
      --  Java Configuration Appraoch
Spring 4.0  ------->  2014
  --  Support Java 8

```


##### Dependency Injection
* A dependency is an attribute(instance variable) of class(Eventually become reference to an Object)
* A dependency is injected either using setter method or using constructor arguments.
* We define metadata using xml configuation or annotations that defined what dependencies to inject.
* The process of injecting dependencies is called wiring and it put all the wired objec in spring container.
* Spring manages the beans lifecycle.
