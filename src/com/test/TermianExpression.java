package com.test;

/**
 * @ProjectName: interpreter-test
 * @Package: com.test
 * @ClassName: TermianExpression
 * @Description:
 * @Author: Xiao Nong
 * @Version: 1.0
 */
public class TermianExpression extends  AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("终端解释器");
    }
}
