package com.example.demo.package2;

import com.example.demo.package1.Student;

public class Test2 {
    //异包异类中测试
    public static void main(String[] args) {
        Student student = new Student();
        //sex 都可以取的到
        // grade 取不到  因为它是private  属性
        // name 取不到  因为它是default  属性
        // age 取不到  因为它是protected  属性
        String name = student.name;
        String grade = student.grade;
        String sex = student.sex;
        String age = student.age;
    }
}
