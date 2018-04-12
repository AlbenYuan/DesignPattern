# Iterator Patter
> 迭代器模式，提供一种方法顺序访问一个聚合对象中的各种元素，而又不暴露该对象的内部表示.

## 角色
* 迭代器(Iterator)：声明迭代的接口
* 具体的迭代器(ConcreteIterator)：具体的迭代方式的实现
* 容器(Aggregate)：声明容器接口，
* 具体容器(ConcreteAggregate)：容器的具体实现，提供获取迭代器的接口

## 应用场景

* 访问一个聚合对象的内容而无需暴露它的内部表示
* 支持对聚合对象的多种遍历
* 为遍历不同的聚合结构提供一个统一的接口

## 优缺点

### 优点
   * 简化了遍历方式
     > 对于对象集合的遍历，还是比较麻烦的，对于数组或者有序列表，我们尚可以通过游标来取得，但用户需要在对集合了解很清楚的前提下，自行遍历对象，但是对于hash表来说，用户遍历起来就比较麻烦了。而引入了迭代器方法后，用户用起来就简单的多了。
   * 可以提供多种遍历方式
     > 比如说对有序列表，我们可以根据需要提供正序遍历，倒序遍历两种迭代器，用户用起来只需要得到我们实现好的迭代器，就可以方便的对集合进行遍历了。
   * 封装性良好
     > 用户只需要得到迭代器就可以遍历，而对于遍历算法则不用去关心。
     
### 缺点 
  * 对于比较简单的遍历（像数组或者有序列表），使用迭代器方式遍历较为繁琐，大家可能都有感觉，像ArrayList，我们宁可愿意使用for循环和get方法来遍历集合。