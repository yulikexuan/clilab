//: com.yulikexuan.clilab.ClilabApplication.java


package com.yulikexuan.clilab;


import com.yulikexuan.clilab.commands.GreetingCommand;


public class ClilabApplication {

    public static void main(String[] args) {
        new GreetingCommand().run();
    }

}///::~