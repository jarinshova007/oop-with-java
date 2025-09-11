/* if there is a non-satic method on the top level (outside the Main(in case Static) method and a static method of
same name inside the Static method then it will be possinle to run the code. Otherwise not */

// it is not possible to overload or override a class

// 1st class                       
class Animal1 {
    void sound() {
        System.out.println("Woof Woof 1");
    }

    // 1st sub class
    class Animal {
    void sound() {
            System.out.println("SubWoof SubWoof 1");
        }
    }
}
public class Static {
    // 2nd class 
    class Animal2 {
    void sound() {
            System.out.println("Woof Woof 2");
        }
    }
    // 3rd class
    class Animal3 {
    void sound() {
            System.out.println("Woof Woof 3");
        }
    }     
    // static class
    static class Animal {
        void sound() {
            System.out.println("StaticWoof StaticWoof");
        }
    }
    public static void main(String[] args) {
        // 1st class
        Animal1 a = new Animal1();
        a.sound();

        // 1st sub class
        Animal1.Animal b = a.new Animal();
        b.sound();
        
        // 2nd class
        Static m = new Static();
        Static.Animal2 c = m.new Animal2();
        c.sound();

        // 3rd class
        Static.Animal3 d = m.new Animal3();
        d.sound();

        // static class
        Static.Animal e = new Animal();
        e.sound();

        // non static class
        Animal f = new Animal(); 
        f.sound(); // it won't work. It will call the sound method from the static Animal class
    }
}
// non static class (is case a useless class)
    class Animal {
        void sound() {
            System.out.println("Non-StaticWoof Non-StaticWoof");
        }
    }