package aopdemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Description:
 *
 * @author:edgarding
 * @date:2021/1/22
 **/
class SimpleAOPTest {
    @Test
    void getProxy() {
        // 创建一个MethodInvocation实现类
        MethodInvocation logTask = () -> System.out.println("log task start");
        HelloServiceImpl helloService = new HelloServiceImpl();
        // 创建一个Advice
        Advice beforeAdvice = new BeforeAdvice(helloService, logTask);
        // 为目标对象生成代理
        HelloService helloServiceImplProxy = (HelloService) SimpleAOP.getProxy(helloService, beforeAdvice);

        helloServiceImplProxy.sayHelloWorld();
        helloServiceImplProxy.sayHelloWorld();

    }
}