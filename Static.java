// This class is to demonstrate the structure of a Java class with static members
public class Static {
        static int staticValue; // static variable
        int value; // instance variable

        // static setter for staticValue (static method)
        static void setStaticValue(int staticValue) { 
            Static.staticValue = staticValue;
        }

        // setter for value (non-static method)
        void setValue(int value) {
            this.value = value;
        }
    public static void main(String[] args) {
        System.out.println(staticValue);

        // static method call without class object
        Static.setStaticValue(100);
        
        // non-static method call with class object
        Static s = new Static();
        s.setValue(50);

        // print
        System.out.println("staticValue: " + Static.staticValue);
        System.out.println("value: " + s.value);
    }
}