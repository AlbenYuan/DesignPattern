#工厂模式

> 专门负责将大量有共同接口的类的实例。工厂模式可以动态决定将实例化哪一个类，不必事先知道每次要实例化的类。

### 种类
* 简单工厂(Simple Factory)
> 又称静态工厂方法模式(Static Factory Method Pattern)。
* 工厂方法(Factory Method)
> 又称多态性工厂(Polymorphic Factory)、虚拟构造(Virtual Constructor)模式。
* 抽象工厂(Abstract Factory)
> 又称工具箱(Kit或Toolkit)模式。

### 简单工厂
> 有一个工厂类根据传入的参数决定生产哪一个产品。

#### 角色

* 工厂类(Creator)
> 参与生产产品的的工厂，定义生产接口。

* 抽象产品(Product)
> 所有产品的抽象父类。

* 具体产品(Concrete Product)
> 所有的产品具体分类。

### 工厂方法
> 定义一个生产产品的职责，而把实际的生产过程推迟到子类中实现。

### 角色

* 工厂接口(Creator)
> 定义参与生产的工厂的职责。

* 具体工厂(Concrete Creator)
> 参与生产产品的的实际工厂，实现生产接口。

* 抽象产品(Product)
> 所有产品的抽象父类。

* 具体产品(Concrete Product)
> 所有的产品具体分类。

### 抽象工厂
> 向客户提供一个接口，使得客户端在不必指定产品的具体类型的情况下，创建多个产品组中的产品对象。

### 角色

* 抽象工厂(Abstract Factory)
> 定义参与生产的工厂的职责。

* 具体工厂(Concrete Factory)
> 参与生产产品的的实际工厂，实现生产接口。

* 抽象产品(Abstract Product)
> 所有产品的抽象父类。

* 具体产品(Concrete Product)
> 所有的产品具体分类。

