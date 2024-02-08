package org.example;

public class ExampleClass {
    int intValue;
    double doubleValue;
    String stringValue;

    public ExampleClass(){
        intValue = 0;
        doubleValue = 0.0;
        stringValue = "";
    }

    public ExampleClass(int intValue, double doubleValue, String stringValue) {
        this.intValue = intValue;
        this.doubleValue = doubleValue;
        this.stringValue = stringValue;
    }
    // copy constructor
    public ExampleClass(ExampleClass other){
        this.intValue = other.intValue;

    }
    // constructor  over loading

    ExampleClass(int intValue, double doubleValue ){
        this.intValue = intValue;
        this.doubleValue = doubleValue;
        this.stringValue = "overload";
    }

    ExampleClass(String stringValue){
        this.intValue = 0;
        this.doubleValue = 0.0;
        this.stringValue = stringValue;
    }
    public void displayValue(){
        String msg = this.stringValue == null ? "": this.stringValue;
        System.out.printf("This is the int value %d, this is the double value %f this is the string value %s",
                this.intValue, this.doubleValue, msg );
    }
    void performCalulation(){
        System.out.println("Performing work");
    }
    String getStringValue(){
        return  this.stringValue;
    }

    int getIntValue(){
        return this.intValue;
    }
    void setInteger(int x){
        this.intValue = x;
    }
}
