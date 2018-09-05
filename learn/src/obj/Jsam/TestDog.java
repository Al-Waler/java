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

    }
}
