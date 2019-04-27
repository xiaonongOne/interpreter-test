package com.test1;

import java.util.HashSet;
import java.util.Set;

/**
 * @ProjectName: interpreter-test
 * @Package: com.test1
 * @ClassName: TerminalExpression
 * @Description:
 * @Author: Xiao Nong
 * @Version: 1.0
 */
public class TerminalExpression implements Expression {

    // 存储歌曲名称和歌手
    private Set<String> set= new HashSet<String>();

    public TerminalExpression(String[] data)
    {
        for(int i=0;i<data.length;i++) set.add(data[i]);
    }

    @Override
    public boolean interpret(String info) {
        if(set.contains(info))
        {
            return true;
        }
        return false;
    }
}
