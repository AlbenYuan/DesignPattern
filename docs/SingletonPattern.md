#Singleton Pattern
在应用程序中，只存在一个实例。

## 创建方式
* 按加载顺序可分为：懒汉模式、饿汉模式
    * 懒汉模式：第一次使用时创建对象
    * 饿汉模式：类加载时创建
* 实现方式：私有构造器、线程锁、静态代码块、内部类、枚举等是实现方式
* 线程安全：


## 懒汉模式
第一次使用时创建。

```java
public class LazySingleton {

    private static LazySingleton instance = null;

    // 私有化构造方法
    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (null == instance) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
```
>以上代码在多线程时，会存在线程安全的问题。如果创建过程中，有其他线程也调用了`getInstance()`方法，则会产生多个实例。故在多线程中，需要加上线程锁。

```java
public class LazySingleton {

    private static LazySingleton instance = null;

    // 私有化构造方法
    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (null == instance) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
```

## 饿汉模式
类加载时创建

```java
public class EagerSingleton {

    private static EagerSingleton instance = new EagerSingleton();

//    static {
//        instance = new EagerSingleton();
//    }

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
```

> 创建的过程可以在定义时创建，也可以放在静态代码块中创建。由于在类加载时创建，故不存在线程不安全的问题。

## 内部类
在内部类加载的时候，实例对象。
```java
public class SingletonInnerClass {

    private static class SingletonHolder {
        private static final SingletonInnerClass instance = new SingletonInnerClass();
    }

    private SingletonInnerClass() {
    }

    public static final SingletonInnerClass getInstance() {
        return SingletonHolder.instance;
    }
}
```

## 枚举

```java
public enum SingletonEnum {

    INSTANCE();

    SingletonEnum() {
    }

    public static SingletonEnum getInstance() {
        return INSTANCE;
    }
}
```

## JAVA创建对象的方式
* ```new```关键字，调用了构造函数
 ```java
 String str = new String();
 ```
 
* ```Class.newInstance()```，调用了构造函数
 ```java
Class clazz = Class.forName(String.class.getName());
String str = (String) clazz.newInstance();
 ```
* ```Constructor.newInstance()```，调用了构造函数
 ```java
Constructor<String> constructor = String.class.getConstructor();
String str = constructor.newInstance();
 ```
* ```Cloneable.clone()```，没有调用构造函数
  实现```Cloneable```接口，
```java
public class Entity implements Cloneable{
    
    @Override  
    protected Entity clone() throws CloneNotSupportedException {  
        return (Entity) super.clone();
    }  
}
```
* 反序列化，没有调用构造函数

 ```java
FileInputStream fis = new FileInputStream(filepath);
ObjectInputStream ois = new ObjectInputStream(fis);
String str = (String) ois.readObject();
ois.close();
fis.close();
 ```