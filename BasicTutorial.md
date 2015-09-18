## Goals ##
One of the main problems of the GXT framework is it's **untestability** - in a nutshell, the GXT visual components cannot be mocked (via such frameworks as _Mockito_ or _EasyMock_), making any attempt to **test** the code (in the JVM) impossible.

In order to address this problem, the _gxt-interfaces_ project essentially creates a **thin layer** on top of GXT, so that the client can work with **interfaces** instead of the actual GXT classes, with the immediate benefit that everything becomes testable.


## Tests in the JVM vs GWTTestCase ##
#### Speed ####
GWT provides the _GWTTestCase_ class to achieve unit testing of the client code. The tests run similar to hosted mode, with the code already compiled down into javascript, and using the actual DOM components of the browser.

The problem is that your tests will be very slow, for many reasons: in order to run the test, the entire module has to be compiled, which may take a 20-30 seconds for any module of reasonable size. And you're probably not compiling a single module. Second, the test interacts with the DOM, which is a very slow operation in itself.

This makes the simple goal of running your entire test suite several times a day a real problem, seeing how that could mean hundreds of tests spread over many different GWT modules. You can forget about the immediate feedback that you get from running suite, and you can clearly forget about TDD.

The alternative is running the tests in the JVM, orders of magnitude faster, and without touching the DOM once.


#### Clean separation of concerns ####
Doing _GWTTestCase_ type testing allows the user to write the tests without even trying to get a clean separation between the business logic and the visual components. And even the most experienced and disciplined developer will still mix in logic and visual elements if the underlying framework doesn't help him to enforce this separation. One of the major advantages of running the tests in the JVM is that you simply cannot do this - as soon as you try to test something that touched the DOM, your test fails. This makes a clean separation of concerns necessary, and when that separation is not there, the test clearly indicates this fact, driving the design of the application.
One way to get this sort of separation is using the MVP pattern (Model View Presenter).


#### Framework availability ####
Another noticeable difference between is the option of frameworks: _GWTTestCase_ uses _JUnit 3_ and only _JUnit 3_. If the tests run in the JVM however, any framework or combination of frameworks may be used. A recommendation would be _JUnit 4_ and _Mockito_.



## Setup (draft) ##
  * include the _gxt-interfaces_ jar on the classpath of your project (via manual inclusion, maven or some other type of dependency management)
  * inherit the GXTInterfaces module from within your application module (no package required)
```
<inherits name='gxt.GXTInterfaces'/>
```
  * done



## Usage and examples ##
- instead of:
```
Button button = new Button();
```
use:
```
IButton button = new VButton();
```

- or more generic:
```
IComponent button = new VButton();
```


## Mocking ##
#### with Mockito ####
- mocking a button:
```
IButton buttonMock = Mockito.mock( IButton.class );
```


## Test sample ##
This is a simple example test, with the following functionality:
**a button is mocked (using it's interface)** an interaction is done on the button
**the interaction is simply verified with Mockito**

```
@Test
public void serverCommunicationStarted_theActionButtonIsDisabled(){
   // Arrange
   final IButton buttonMock = Mockito.mock( IButton.class ); 

   // Act
   buttonMock.disable(); 

   // Assert
   Mockito.verify( buttonMock ).disable(); 
}
```