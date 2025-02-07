package IteratorsAndComparators;


import java.util.Scanner;

public class Engine implements Runnable {

    private Scanner scan;
    private String line;
    private CommandParser commandParser;

    public Engine() {
        this.scan = new Scanner(System.in);
        this.line = "";
        this.commandParser = new CommandParser();
    }

    public void run(){
        this.line = this.scan.nextLine();


        while (!this.line.equals("END")){


            commandParser.go(line);

            this.line = this.scan.nextLine();
        }
    }
}
