package c02.sec11;

public class VariableScopeExample {
    public static void main(String[] args) {

        int v1 = 15;
        if(v1 > 10){
            int v2 = v1 - 10;

        }
//        int v3 = v1 + v2 + 5; 변수 v2는 if 안에서만 사용가능
    }
}
