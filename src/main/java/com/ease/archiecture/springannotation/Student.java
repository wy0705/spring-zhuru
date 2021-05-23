package com.ease.archiecture.springannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//如果不标注的话，类名首字母小写做k
@Component
public class Student {

    @Autowired//依赖注入
    private Clazz clazz;

    /*@Value("12")
    private int age;*/

    public Clazz getClazz() {
        return clazz;
    }


    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public void clazzPrint() {
        clazz.clazzPrint();
    }
}
