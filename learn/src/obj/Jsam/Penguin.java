package obj.Jsam;

abstract class Animal {
    protected String name;
    protected int id;
    public Animal(String myName, int myid) {
        name = myName;
        id = myid;
    }
    abstract void test();
    public void eat() {System.out.println("fffffffffff");}
    public void sleep() {}
}
interface A {
    public abstract void eat();
    public abstract void sleep();
}


public class Penguin extends Animal implements A{
    public void test() {
        //抽象类
    }
    public Penguin(String myName, int myid) {
        super(myName, myid);
    }
    public void eat(){System.out.println("ddddddddddddcccc");}
    public void eatTest() {
        this.eat();//自身引用
        super.eat();//父类引用
    }
    public static void main(String[] args) {
        Penguin penguin = new Penguin("ddd",13);
        System.out.println(penguin.name);
        penguin.eatTest();
        /*构造器
        子类不能继承父类的构造器（构造方法或者构造函数），如果父类的构造器带有参数，则必须在子类的构造器中显式地通过 super 关键字调用父类的构造器并配以适当的参数列表。
        如果父类构造器没有参数，则在子类的构造器中不需要使用 super 关键字调用父类构造器，系统会自动调用父类的无参构造器。*/
    }
}
