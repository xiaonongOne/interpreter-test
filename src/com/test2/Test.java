package com.test2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @ProjectName: interpreter-test
 * @Package: com.test2
 * @ClassName: Test
 * @Description:
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public class Test {

    public static void main(String[] args) {
        String statement = "3 * 2 * 4 / 3 % 5";
        Calculator calculator = new Calculator();
        calculator.build(statement);
        System.out.println(statement+" = "+calculator.compute());

    }
}

