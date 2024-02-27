package ch04.sec07;

public class test04 {
    public static void main(String[] args) {

        boolean yam = true;
        while  (yam){
            int num1 = (int)(Math.random()*6)+1;
            int num2 = (int)(Math.random()*6)+1;
            System.out.println("num1 + num2 = "+(num1+num2));
            if(num1+num2 == 5){
                System.out.println("num1 + num2 = "+ (num1+num2));
                yam = false;
            }

        }

    }
}
