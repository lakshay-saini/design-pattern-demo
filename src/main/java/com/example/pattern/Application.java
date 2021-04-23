package com.example.pattern;

import com.example.pattern.builder.Employee;
import com.example.pattern.prototype.Rectangle;

public class Application {

    public static void main(String[] args) throws CloneNotSupportedException {

        Rectangle rectangleTest1 = new Rectangle();
        rectangleTest1.setLength(100);
        rectangleTest1.setColor("read");
        rectangleTest1.setHeight(100);
        rectangleTest1.setWidth(100);



        Rectangle rectangleTest2 = (Rectangle) rectangleTest1.clone();
        if(rectangleTest1.equals(rectangleTest2)) {
            System.out.println("rectangleTest2 = rectangleTest1" );
        }

        System.out.println(rectangleTest1.hashCode() +"    "+ rectangleTest2.hashCode());

        Employee employee = new Employee.EmployeeBuilder(11).setVar2(33).setVar3(44).setVar4(55).build();
    }
}
