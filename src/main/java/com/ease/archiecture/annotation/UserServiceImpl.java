package com.ease.archiecture.annotation;


import org.springframework.stereotype.Service;

@Service
//如果不标注的话，类名首字母小写做k
public class UserServiceImpl {
    public void printName() {
        System.out.println("abc");
    }
}
