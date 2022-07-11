package com.think.mortgage;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

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
        final byte MONTHS_IN_YEAR = 12; // 年中的月数
        final byte PERCENT = 100; // 百分数单位
        // 输入贷款金额
        int principal = (int) readNumber("Principal", 1_000, 1_000_000);
        int years = (int) readNumber("Years", 1, 30);
        int numOfMonths = years * MONTHS_IN_YEAR;
        // 输入贷款年利率
        float interest = readNumber("Interest", 1, 5);
        float rate = interest / PERCENT / MONTHS_IN_YEAR; // 年利率转换为月利率
        double mortgage = calcMortgage(principal, rate, numOfMonths);

        // 从数字格式化器中获取一个现金格式化器
        String format = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println(format);

    }

    public static double calcMortgage(int principal, float rate, int numOfMonths) {
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
            System.out.print(prompt+ "：");
            number = scanner.nextFloat();
            if (number >= min && number <= max) break; // 跳出循环体，进入下一步输入环节

            System.out.println(prompt + " must be between " + min + " and " + max + ".");
        }
        return number;
    }

}
