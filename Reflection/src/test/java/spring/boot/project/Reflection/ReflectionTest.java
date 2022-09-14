package spring.boot.project.Reflection;

import org.junit.jupiter.api.Test;

public class ReflectionTest {

    @Test
    void byteGetClassTest() {
        byte[] bt = new byte[1024];
        Class cs = bt.getClass(); //class
        System.out.println(cs);
    }

    @Test
    void classTypeTest() {
        boolean wrong;
//        Class cs2 = wrong.getClass(); 컴파일 에러
        System.out.println(boolean.class); // boolean
//        Class cs1 = wrong.class 컴파일 에러
        System.out.println(String.class); // class java.lang.String

        System.out.println(int[][].class); // class [[I
    }

    @Test
    void classForName() throws ClassNotFoundException {
        System.out.println(Class.forName("spring.boot.project.Serialize.Etc"));
        //class spring.boot.project.Serialize.Etc
    }

    @Test
    void primitiveType() {
        System.out.println(Double.TYPE); // double
        System.out.println(Void.TYPE); // void
    }
}
