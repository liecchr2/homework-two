package edu.isu.cs.cs2263.hw02;

public class StringTokenizer implements PushbackTokenizer{

    StringTokenizer toke;

    public StringTokenizer(String str) {
        toke = new StringTokenizer(str);
    }

    @Override
    public String nextToken() {
        return null;
    }

    @Override
    public boolean hasMoreTokens() {
        return false;
    }

    @Override
    public void pushback() {

    }
}
