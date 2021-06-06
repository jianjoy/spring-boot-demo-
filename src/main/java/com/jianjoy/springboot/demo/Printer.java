package com.jianjoy.springboot.demo;

import io.kimmking.spring02.Klass;
import io.kimmking.spring02.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Author: zhoujian
 * Description:
 * Date: 2021/6/6 19:22
 */
@Component
public class Printer {

    @Autowired
    private School school;

    @Autowired
    private Klass klass;


    @PostConstruct
    public void print() {
        System.out.println("test invoke");
        school.ding();
        klass.dong();
    }

}