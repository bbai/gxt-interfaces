This is a thin layer of interfaces and simple implementations that sits on top of the GXT framework. The main purpose is to provide a simple way of creating code that is completely testable and mockable via mocking frameworks (such as Mockito).

## Goals ##

One of the main problems of the GXT framework is it's untestability - in a nutshell, the GXT visual components cannot be mocked (via such frameworks as Mockito or EasyMock?), making any attempt to test the code (in the JVM) impossible.

In order to address this problem, the gxt-interfaces project essentially creates a thin layer on top of GXT, so that the client can work with interfaces instead of the actual GXT classes, with the immediate benefit that everything becomes testable.

## Examples ##
- instead of:
```
Button button = new Button();
```
write:
```
IButton button = new VButton();
```

- or more generic:
```
IComponent button = new VButton();
```