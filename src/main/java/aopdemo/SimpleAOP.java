package aopdemo;

import java.lang.reflect.Proxy;

/**
 * Description:
 *
 * @author:edgarding
 * @date:2021/1/22
 **/
public class SimpleAOP {
    public static Object getProxy(Object bean, Advice advice) {
        return Proxy.newProxyInstance(SimpleAOP.class.getClassLoader(),
                bean.getClass().getInterfaces(), advice);
    }
}
