package org.example;

public class ChildExampleClass extends ExampleClass{
    int intaVallue;
    double doublaValue;

    public ChildExampleClass(String stringValue, double doublaValue){
        this.doublaValue  = doublaValue;
    }

    public ChildExampleClass(String name, int intaVallue, double doublaValue){
        super(intaVallue, doublaValue);
        name = "OOp";
    }
}
