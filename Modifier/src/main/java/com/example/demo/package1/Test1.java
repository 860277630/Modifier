package com.example.demo.package1;

public class Test1 {
    //同包异类中测试
    public static void main(String[] args) {
        Student student = new Student();
        //name  sex age  都可以取的到
        // grade 取不到  因为它是private  属性
        String name = student.name;
        String grade = student.grade;
        String sex = student.sex;
        String age = student.age;
    }
}
