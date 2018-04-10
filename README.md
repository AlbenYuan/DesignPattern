# Design Pattern

使用java实现设计模式。

### 设计模式的分类

* 创建型模式 (Creational Pattern)
    * [工厂方法模式 (Factory Methods, Simple Factory, Static Factory)](./docs/FactoryPattern.md)
    * [抽象工厂模式 (Abstract Factory Pattern)](./docs/FactoryPattern.md)
    * [单例模式 (Singleton Pattern)](./docs/SingletonPattern.md) 
    * [建造者模式 (Builder Pattern)](./docs/BuilderPattern.md)
    * [原型模式 (Prototype Pattern)](./docs/PrototypePattern.md)

* 结构型模式 (Structural Pattern)
    * [适配器模式 (Adapter Pattern)](./docs/AdapterPattern.md)
    * [装饰器模式 (Decorator Pattern)](./docs/DecoratorPattern.md)
    * [代理模式 (Proxy Pattern)](./docs/ProxyPattern.md)
    * 外观模式 (Facade Pattern)
    * 桥接模式 (Bridge Pattern)
    * [过滤器模式 (Filter、Criteria Pattern)](./docs/FilterPattern.md)
    * [组合模式 (Composite Pattern)](./docs/CompositePattern.md)
    * 享元模式 (Flyweight Pattern)

* 行为型模式 (Behavioral Pattern)
    * 策略模式 (Strategy Pattern)
    * 模板方法模式 (Template Pattern)
    * 观察者模式 (Observer Pattern)
    * 迭代器模式 (Iterator Pattern)
    * 责任链模式 (Chain of Responsibility Pattern)
    * 命令模式 (Command Pattern)
    * 备忘录模式 (Memento Pattern)
    * 状态模式 (State Pattern)
    * 访问者模式 (Visitor Pattern)
    * 中介者模式 (Mediator Pattern)
    * 解释器模式 (Interpreter Pattern)
    * 空对象模式 (Null Object Pattern)

### 设计原则 ###

* 开闭原则 (Open Close Principle)
> 开闭原则就是说对扩展开放，对修改关闭。在程序需要进行拓展的时候，不能去修改原有的代码，实现一个热插拔的效果。所以一句话概括就是：为了使程序的扩展性好，易于维护和升级。想要达到这样的效果，我们需要使用接口和抽象类，后面的具体设计中我们会提到这点。

* 里氏代换原则 (Liskov Substitution Principle)
> 里氏代换原则面向对象设计的基本原则之一。 里氏代换原则中说，任何基类可以出现的地方，子类一定可以出现。 LSP是继承复用的基石，只有当衍生类可以替换掉基类，软件单位的功能不受到影响时，基类才能真正被复用，而衍生类也能够在基类的基础上增加新的行为。里氏代换原则是对“开-闭”原则的补充。实现“开-闭”原则的关键步骤就是抽象化。而基类与子类的继承关系就是抽象化的具体实现，所以里氏代换原则是对实现抽象化的具体步骤的规范。—— From Baidu 百科

* 依赖倒转原则 (Dependence Inversion Principle)
> 这个是开闭原则的基础，具体内容：真对接口编程，依赖于抽象而不依赖于具体。

* 接口隔离原则 (Interface Segregation Principle)
> 使用多个隔离的接口，比使用单个接口要好。还是一个降低类之间的耦合度的意思，从这儿我们看出，其实设计模式就是一个软件的设计思想，从大型软件架构出发，为了升级和维护方便。所以上文中多次出现：降低依赖，降低耦合。

* 迪米特法则 (最少知道原则) (Demeter Principle)
> 为什么叫最少知道原则，就是说：一个实体应当尽量少的与其他实体之间发生相互作用，使得系统功能模块相对独立。

* 合成复用原则 (Composite Reuse Principle)
> 原则是尽量使用合成/聚合的方式，而不是使用继承。


### J2EE ###
> 这些设计模式特别关注表示层。这些模式是由 Sun Java Center 鉴定的。

* MVC 模式 (MVC Pattern)
* 业务代表模式 (Business Delegate Pattern)
* 组合实体模式 (Composite Entity Pattern)
* 数据访问对象模式 (Data Access Object Pattern)
* 前端控制器模式 (Front Controller Pattern)
* 拦截过滤器模式 (Intercepting Filter Pattern)
* 服务定位器模式 (Service Locator Pattern)
* 传输对象模式 (Transfer Object Pattern)