package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: interpreter-test
 * @Package: com.test
 * @ClassName: Client
 * @Description:
 * @Author: Xiao Nong
 * @Version: 1.0
 */
public class Client {


    public static void main(String[] args) {
        Context context = new Context();
        List<AbstractExpression> list = new ArrayList<AbstractExpression>();
        list.add(new TermianExpression());
        list.add(new NonterminalExpression());
        list.add(new TermianExpression());
        list.add(new TermianExpression());

        for (AbstractExpression abstractExpression: list) {
             abstractExpression.interpret(context);
        }
    }
}
