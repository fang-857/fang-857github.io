package com.think.oop.mortgage;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    // 把方法中的局部变量，转换成全局变量
    // HOIST：提升
    private final static byte PERCENT = 100; // 百分数单位
    private final static byte MONTHS_IN_YEAR = 12; // 年中的月数

    /**
     * <p>需求：输入贷款金额、贷款年利率、贷款时长（年），输出月还款金额</p>
     * <p>计算公式：M = P[i(1+i)^n]/[(1+i)^n -1]</p>
     * <ol>
     *     <li>M：月还款金额</li>
     *     <li>P：贷款金额</li>
     *     <li>i：贷款年利率</li>
     *     <li>n：贷款时长（年）</li>
     * </ol>
     *
     * <p>相关的输入的校验</p>
     * <ol>
     *      <li>贷款金额：1,000 ～ 1,000,000</li>
     *      <li>贷款年利率：1 ～ 5</li>
     *      <li>贷款时长：1 ～ 30</li>
     * </ol>
     *
     * @param args 控制台参数
     */
    public static void main(String[] args) {
        // 输入贷款金额
        int principal = (int) readNumber("Principal", 1_000, 1_000_000);
        byte years = (byte) readNumber("Years", 1, 30);
        int numOfMonths = years * MONTHS_IN_YEAR;
        // 输入贷款年利率
        float interest = readNumber("Interest", 1, 5);
        double mortgage = calcMortgage(principal, interest, numOfMonths);

        // 从数字格式化器中获取一个现金格式化器
        System.out.println("MORTGAGE");
        System.out.println("--------");
        String format = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println(format);
        System.out.println("BALANCE");
        System.out.println("--------");
        for (int month = 1; month <= years * 12; month++) {
            double balance = calcBalance(principal, interest, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }


    }

    public static double calcBalance(int principal, float interest, byte years, int numberOfPaymentsMade) {
        float monthlyRate = interest / PERCENT / MONTHS_IN_YEAR;
        float numberOfPayments = years * MONTHS_IN_YEAR;

        double temp1 = Math.pow(1 + monthlyRate, numberOfPayments);
        double temp2 = Math.pow(1 + monthlyRate, numberOfPaymentsMade);
        return principal * (temp1 - temp2) / (temp1 - 1);
    }

    public static double calcMortgage(int principal, float interest, int numOfMonths) {
        float rate = interest / PERCENT / MONTHS_IN_YEAR; // 年利率转换为月利率
        double exp1 = Math.pow(1 + rate, numOfMonths);
        return principal * rate * exp1 / (exp1 - 1);
    }

    /**
     * <p>从控制台读取输入参数</p>
     */
    public static float readNumber(String prompt, int min, int max) {
        float number;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(prompt + "：");
            number = scanner.nextFloat();
            if (number >= min && number <= max) break; // 跳出循环体，进入下一步输入环节

            System.out.println(prompt + " must be between " + min + " and " + max + ".");
        }
        return number;
    }

}
