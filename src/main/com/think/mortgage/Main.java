package com.think.mortgage;

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

        Scanner scanner = new Scanner(System.in);

        // 输入贷款金额

        int principal;

        while (true) {
            System.out.print("Principal：");
            principal = scanner.nextInt();
            // 贷款金额在1000 - 1000000之间
            if (principal >= 1_000 && principal <= 1_000_000) break; // 跳出循环体，进入下一步输入环节

            System.out.println("Principal must be between 1000 and 1000000.");
        }

        // 输入贷款金额
        int years;
        while (true) {
            System.out.print("Years：");
            years = scanner.nextInt();
            if (years >= 1 && years <= 30) break; // 跳出循环体，进入下一步输入环节

            System.out.println("Years must be between 1 and 30.");
        }
        int numOfMonths = years * MONTHS_IN_YEAR;


        // 输入贷款年利率
        float interest;
        while (true) {
            System.out.print("Interest：");
            interest = scanner.nextFloat();
            if (interest >= 1 && interest <= 5) break; // 跳出循环体，进入下一步输入环节

            System.out.println("Interest must be between 1 and 5.");
        }
        float rate = interest / PERCENT / MONTHS_IN_YEAR;

        // BigDecimal

        double exp1 = Math.pow(1 + rate, numOfMonths);
        double mortgage = principal * rate * exp1 / (exp1 - 1);

        System.out.println(mortgage);

    }

}
