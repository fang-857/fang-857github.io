package com.think.oop;

public class Main {

    public static void test() {
            int num = 10;
            // 使用num执行各种逻辑


        // 这个后面不需要再使用num这个变量了
    }


    public static void main(String[] args) {
        TextBox textBox = new TextBox();
        textBox.setTextValue("Hello World");
        // textBox.textValue = "直接赋值";
        System.out.println(textBox);

        test();
        //

    }
}
