package edu.isu.cs.cs2263.hw02;

public class Driver {
    public static void main (String[] args){
        PushbackTokenizer token = new StringTokenizer("This is a test");

        token.nextToken();

        token.hasMoreTokens();

        token.pushback();
    }
}
