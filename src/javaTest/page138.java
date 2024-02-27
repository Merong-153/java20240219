package javaTest;

public class page138 {
    public static void main(String[] args) {

        System.out.println("------3-----");
        int result = 0;
        for(int i =0; i < 100; i ++){
            if(i%3==0){
                result +=i;
            }
        }
        System.out.println(result);


        System.out.println("-------4-------");

        boolean contlor = true;
        while(contlor){
            int num1 = (int)(Math.random()*6)+1;
            int num2 = (int)(Math.random()*6)+1;
            System.out.println("num1 + num2 = "+(num1+num2));
            if(num1+num2==5){
                contlor = false;
                System.out.println("done "+(num1+num2));
            }
        }
        System.out.println("------5------");

        for(int i = 1; i < 10; i++){
            for(int j = 1; j < 10; j++){
                if((4*i)+(5*j)==60){
                    System.out.println(STR."(\{i},\{j})");
                }
            }
        }


    }
}
