package iocdemo.bean;

import lombok.Data;
import lombok.ToString;

/**
 * Description:
 *
 * @author:edgarding
 * @date:2021/1/22
 **/
@Data
@ToString
public class Car {
    private String name;
    private String length;
    private String width;
    private String height;
    private Wheel wheel;
}
