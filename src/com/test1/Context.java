package com.test1;

/**
 * @ProjectName: interpreter-test
 * @Package: com.test1
 * @ClassName: Context
 * @Description:
 * @Author: Xiao Nong
 * @Version: 1.0
 */
public class Context {

    private String [] persons = {"薛之谦","刘德华","陈奕迅"};

    private String [] songNames = {"丑八怪","冰雨","十年"};

    private Expression personSong;

    public Context()
    {
        Expression person = new TerminalExpression(persons);
        Expression songName = new TerminalExpression(songNames);
        personSong = new AndExpression(person,songName);
    }
    public void findSongs(String info)
    {
        boolean ok = personSong.interpret(info);
        if(ok) System.out.println("正在播放"+info+"，这首歌曲！");
        else System.out.println(info+"，音乐播放器暂时没有这首音乐！");
    }

}
