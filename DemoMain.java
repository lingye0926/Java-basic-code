package cn.itcast.day11.demo05;

/*
如果接口的实现类（或者父类的子类）只需要使用唯一的一次，
那么这种情况下就可以省略掉该类的定义，而改为使用【匿名内部类】

匿名内部类的定义格式：
接口名称 对象名 = new 接口名称(){
    //覆盖重写所有抽象方法
}
 */
public class DemoMain {
    public static void main(String[] args) {
        MyInterface impl = new MyInterfaceImpl();//普通实现类
        impl.method();
        MyInterface some = new MyInterface() {//匿名内部类
            @Override
            public void method() {
                System.out.println("使用匿名内部类覆盖重写了方法！");
            }
        };
        some.method();
    }
}
