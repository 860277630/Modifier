package com.example.demo.package2;

import com.example.demo.package1.Student;

public class Test3 extends Student {
    //异类异包继承测试
    public void test() {
        Student student = new Student();
        //sex 可以取的到
        // age  可以取得到  因为test3是其子类
        // grade 取不到  因为它是private  属性
        // name 取不到  因为它是default  属性
        String name = super.name;
        String grade = super.grade;
        String sex = super.sex;
        String age = super.age;
    }
}
