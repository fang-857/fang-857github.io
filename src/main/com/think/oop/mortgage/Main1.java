package com.think.oop.mortgage;

/**
 * @author
 * @version 1.0
 */
public class Main1 {
    public static void main(String[] args) {
        Person[] person = new Person[5];
        person[0]=new Person("jack",39);
        person[1]=new Student("大哥",19,98.9);
        person[2]=new Student("小弟",17,84.6);
        person[3]=new Teacher("校长",68,50000);
        person[4]=new Teacher("主任",46,35000);
        for (int i = 0; i <person.length ; i++) {
            System.out.println(person[i].say());
            if(person[i]instanceof Student){
                Student stu =(Student)person[i];
                stu.study();
            }else if(person[i]instanceof Teacher){
                Teacher t =(Teacher)person[i];
                t.teach();
            }else if(person[i]instanceof Person){

            }else{
                System.out.println("输入有误");
            }

            }
        }
    }

