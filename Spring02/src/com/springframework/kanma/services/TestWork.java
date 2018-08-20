package com.springframework.kanma.services;

public class TestWork {
    private Tester tester;

    public void setTester(Tester tester) {
        this.tester = tester;
    }
    public void test(){
        tester.doTest();
    }
}
