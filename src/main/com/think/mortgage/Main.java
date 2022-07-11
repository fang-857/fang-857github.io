package com.think.mortgage;

import java.util.Scanner;

public class Main {

    //
    // 计算公式：M = P[i(1+i)^n]/[(1+i)^n -1]

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
     * @param args 控制台参数
     */
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12; // 年中的月数
        final byte PERCENT = 100; // 百分数单位

        Scanner scanner = new Scanner(System.in);

        // 输入贷款金额
        System.out.print("Principal：");
        int principal = scanner.nextInt();

        // 输入贷款金额
        System.out.print("Years：");
        int years = scanner.nextInt();
        int numOfMonths = years * MONTHS_IN_YEAR;

        // 输入贷款年利率
        System.out.print("Interest：");
        float interest = scanner.nextFloat();
        float rate = interest/ PERCENT / MONTHS_IN_YEAR;

        // BigDecimal

        double exp1 = Math.pow(1 + rate, numOfMonths);
        double mortgage = principal * rate * exp1 / (exp1 - 1);

        System.out.println(mortgage);

    }

}
