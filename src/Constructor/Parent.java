package Constructor;

class Parent {
//    private int x = 3;
//
//    Parent() {
//        System.out.println("Parent : Parent() Constructor Set x =" + x);
//    }
}

class Child extends Parent {  //จะทำงานของหลัง extends ก่อนเสมอ
    private int y;
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("child : Default constructor Set y = "+child.y);
    }
}
