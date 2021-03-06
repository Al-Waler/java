package obj.Jsam;


class Animals{
    public void move() {
        System.out.println("动物可以移动");
    }
}

class Dogs extends Animals {
    public void move(){System.out.println("Dog is run");}
    public String move(String str) {
        //重载
        return "ddd";
    }
    public void brank() {System.out.println("Dog is brank");}
}

public class TestDog {
    public static void main (String[] args) {
        Animals animals = new Animals();
        Dogs dogs = new Dogs();
        animals.move();
        dogs.move("sss");
        //dogs.brank();异常 父类声明对象不能调用父类不存在的方法，若方法被重写则调用重写后的方法

        //抽象类
        /*声明抽象方法会造成以下两个结果：

        如果一个类包含抽象方法，那么该类必须是抽象类。
        任何子类必须重写父类的抽象方法，或者声明自身为抽象类。*/
        //抽象类总结规定
        /*  1. 抽象类不能被实例化(初学者很容易犯的错)，如果被实例化，就会报错，编译无法通过。只有抽象类的非抽象子类可以创建对象。
            2. 抽象类中不一定包含抽象方法，但是有抽象方法的类必定是抽象类。
            3. 抽象类中的抽象方法只是声明，不包含方法体，就是不给出方法的具体实现也就是方法的具体功能。
            4. 构造方法，类方法（用static修饰的方法）不能声明为抽象方法。
            5. 抽象类的子类必须给出抽象类中的抽象方法的具体实现，除非该子类也是抽象类。
         */
    }
}
