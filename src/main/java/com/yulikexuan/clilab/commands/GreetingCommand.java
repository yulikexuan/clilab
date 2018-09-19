//: com.yulikexuan.clilab.commands.GreetingCommand.java


package com.yulikexuan.clilab.commands;


import picocli.CommandLine;

import static picocli.CommandLine.*;


@Command(name = "Greet", header = "%n@|green Hello world demo|@")
public class GreetingCommand implements Runnable {

    @Option(names = {"-u", "--user"}, required = true, description = "The user name.")
    String name;

    public void run() {
        System.out.println(">>>>>>> Greetings " + this.name + "!");
    }


    public static void main(String... args) {
        CommandLine.run(new GreetingCommand(), System.err, args);
    }

}///:~