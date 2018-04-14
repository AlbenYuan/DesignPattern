package com.albenyuan.pattern.facade;

/**
 * @Author Alben Yuan
 * @Date 2018-04-14 20:46
 */
public class Facade {

    private SubSystem1 system1 = new SubSystem1();

    private SubSystem2 system2 = new SubSystem2();

    public void operation() {
        /**
         *  调用子系统完成业务操作
         */
        system1.operation();
        system2.operation();
    }


}
