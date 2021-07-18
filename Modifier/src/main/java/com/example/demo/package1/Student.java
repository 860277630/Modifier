package com.example.demo.package1;
//修饰符可以修饰  类  方法   属性  下面我们以属性为例子


/**
 * default（即缺省，什么都不写）：同一个包内可见。
 *     用于修饰：类，接口，变量，方法
 *
 * private：在同一内可见
 *    用于修饰：变量、方法。注意：不能修饰类（外部类，可以修饰内嵌类）
 *
 * public:对所有类可见。
 *    用于修饰：类、接口、变量、方法
 *
 * protected: 对同一包内的类和所有子类可见。
 *    用于修饰： 变量、方法。注意：不能修饰类（外部类，可以修饰内嵌类）
 *
 */
public class Student {
    //default
    String name;
    //private
    private String grade;
    //public
    public String sex;
    //protected
    protected String age;

    //本类中测试
    public static void main(String[] args) {
        Student student = new Student();
        //name grade sex age  都可以取的到
        String name = student.name;
        String grade = student.grade;
        String sex = student.sex;
        String age = student.age;
    }
}
