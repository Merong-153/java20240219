package javaTest;

public class Example {
    public int publicField;
    public void publicMethod() {
        // 메서드 내용
    }
}

class Example2 {

    Example example = new Example();
    int num = example.publicField;
    void method() {
        example.publicField = 0;
        example.publicMethod();
    }


}
