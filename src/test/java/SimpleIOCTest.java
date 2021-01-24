import iocdemo.bean.Car;
import iocdemo.bean.Wheel;
import iocdemo.SimpleIOC;
import org.junit.jupiter.api.Test;

/**
 * Description:
 *
 * @author:edgarding
 * @date:2021/1/22
 **/
class SimpleIOCTest {
    @Test
    public void getBean() throws Exception {
        String location = SimpleIOC.class.getClassLoader().getResource("ioc.xml").getFile();
        SimpleIOC bf = new SimpleIOC(location);
        Wheel wheel = (Wheel) bf.getBean("wheel");
        System.out.println(wheel);
        Car car = (Car) bf.getBean("car");
        System.out.println(car);
    }
}