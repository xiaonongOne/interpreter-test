package com.test;

/**
 * @ProjectName: interpreter-test
 * @Package: com.test
 * @ClassName: NonterminalExpression
 * @Description:
 * @Author: Xiao Nong
 * @Version: 1.0
 */
public class NonterminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("非终端解释器");
    }
}
