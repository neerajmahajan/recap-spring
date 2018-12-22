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


##### Java Configuration
* Spring assumes the objects it creates are singleton and will not recreated it, if it is already there. even when we have implemened the Bean annotated method with new keyword. It internally extends the Configuration class.
* AnnotationConfigApplicationContext


###### @Autowired
* It first tries to wire by Type.
* If multiple bean declaration are found, then it tries to wire by beanName. If none works it throws an exception.
* It is also autowired, if the class is annotated by @Component using the above order of preference AND @ComponentScan is used.
