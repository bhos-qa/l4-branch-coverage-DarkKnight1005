/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lab4;

import java.util.ArrayList;
import java.util.List;

public class App {

    int someValue = 1;
    List<Integer> someList = new ArrayList<Integer>();

    public String getGreeting() {
        return "Hello World!";
    }

    public int getSomeValue() {
        return someValue;
    }

    public long incementSomeValue(int value) {
        someValue += value;
        return someValue;
    }

    public long decrementSomeValue(int value) {
        someValue -= value;
        return someValue;
    }

    public float makeBOOM(){
        return someValue/0;
    }

    public long addTwoIntegers(int a, int b) {
        return a + b;
    }

    public double addTwoFloats(float a, float b) {
        return a + b;
    }

    public long substractTwoIntegers(int a, int b) {
        return a - b;
    }

    public double substractTwoFloats(float a, float b) {
        return a - b;
    }

    public boolean appendToArray(int val){
        return someList.add(val);
    }
}
