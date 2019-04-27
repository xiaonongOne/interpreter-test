package com.test1;

/**
 * @ProjectName: interpreter-test
 * @Package: com.test1
 * @ClassName: Client
 * @Description:
 * @Author: Xiao Nong
 * @Version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.findSongs("陈奕迅的十年");
        context.findSongs("刘德华的冰雨");
        context.findSongs("薛之谦的丑八怪");
        context.findSongs("周杰伦的青花瓷");
    }

}
