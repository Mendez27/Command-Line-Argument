package com.galvanize;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Please first enter name then email.");

        if (args.length < 1)
        {
            System.out.println("Please specify a name and email");
        }
        else if(args.length < 2)
        {
            System.out.println("Please specify an email " +args[0]);
        }
        else
        {
            System.out.println(args[0] + " " + "<" + args[1] + ">");
        }
    }
}