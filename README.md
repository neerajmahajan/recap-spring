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
* If we autowire a collection property it will put all the found beans in that collection.

###### @Resource
* It is the standard autowiring annotation that wires by propertyName.

###### Constructor vs Setter Injection (Guidelines)
* Use Constructor Injection
  * For immutable beans.
  * If the dependencies are mandatory.
* Use Setter Injection
  * When we have optional property.
###### Bean Scope
* By Default, all spring managed beans are singletons.
* Setting the scope to protype returns a new instance everytime.
* Other scope are request etc..

###### Instantiating object through static method and by using non static method of other bean (While using xml configuration).
* for creating object using static method use factory-method
* for creating object by calling method on some other bean use factory-bean and factory-method together.

###### Initialization and Destruction
```
Thes methods should not take any arguments
@Bean(initMethod="", destroyMethod="")

or

inside class use 
@PostConstruct
@PreDestroy

Remeber destroMethod or PreDestroy is called before the object gets destroy.. this will not get called if the scope is prototype.
```
##### AOP
* Join Point : Place where some additional functionality can be applied (Spring allows all public methods managed by spring managed beans)
* Pointcut : Expression that state where functionality can be applied (Actual jointpoint we have declared).
* Advice : The fucntionality we want to apply.
* Aspect : Combines pointcut and advice.
* Weaving :The process of applying an aspect to our system.
* use @EnableAspectJAutoProxy : Be default it can proxy interfaces, but if classes needs to be proxied, then cglib library is required.

##### Testing Transactions
* @Transactional -- If applied at test class level, then every test case will run in a transaction and will rollback it's state when finished.
* @BeforeTransaction : Can be used to execute code before running the transational test method.
* @AfterTransaction  : Opposite to above.
* @Commit : If applied at class level then every test will commit its state
* @Rollback : It is used to override the test method with default commit state.
