package cn.kis2.demo3annotation;
@A(name = "张三",age = 22,hobbies = {"打球", "看书"})
public class AnnotationDemo1 {
    @A(name = "张三",age = 22,hobbies = {"打球", "看书"})
    @B("Delete")
    static void main( @B("Delete") String[] args) {
        System.out.println(1111111111);
        @B("Delete")
        int a;
    }

}
