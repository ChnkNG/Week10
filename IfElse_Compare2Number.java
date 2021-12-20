package Week10;

public class IfElse_Compare2Number {
    public static void main(String[] args) {
        //Number 1 มากกว่า Number2
        //Number 1 น้อยกว่า Number2
        //Number 1 เท่ากับ Number2
    int number1 = 90 , number2 = 33 ;
        //เปรียบเทียบตัวเลข
        if (number1 > number2) {
            System.out.println(number1+ " มากกว่า " +number2);
        } else if(number1 < number2) {
            System.out.println(number1+ " น้อยกว่า " +number2);
        }else {
            System.out.println(number1+ " เท่ากับ " +number2);
        }
    }
}
