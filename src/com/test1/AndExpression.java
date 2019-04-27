package com.test1;

/**
 * @ProjectName: interpreter-test
 * @Package: com.test1
 * @ClassName: AndExpression
 * @Description:
 * @Author: Xiao Nong
 * @Version: 1.0
 */
public class AndExpression implements Expression {

    private Expression person;

    private Expression songName;

    public AndExpression(Expression person,Expression songName)
    {
        this.person=person;
        this.songName=songName;
    }

    @Override
    public boolean interpret(String info) {
        String s[]=info.split("的");
        return person.interpret(s[0])&&songName.interpret(s[1]);
    }

}
