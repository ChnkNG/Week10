package Week10;

public class PositiveNumber {
    public static void main(String[] args) {
        // ให้รับค่าตัวเลข แล้วบอกให้ได้ว่าตัวเลขนั้นเป็นจำนวนเต็มบวกหรือไม่
        int number = -150;
        String result = "";
        // การเขียนแบบ IF-Else
        if (number > 0) {
            result = number +  " เป็นจำนวนเต็มบวก ";
        } else if (number < 0) {
            result = number +  " เป็นจำนวนเต็มลบ ";
        } else {
            result = number +  " เป็นจำนวนเต็มศูนย์ ";
        }
        System.out.println(result);

        // การเขียนแบบ if
        //// กรณีตรวจสอบจำนวนเต็มบวก
        // if (number > 0) {
        // System.out.println("เป็นจำนวนเต็มบวก");
        // }
        // กรณีตรวจสอบจำนวนเต็มลบ
        // if (number < 0) {
        // System.out.println("เป็นจำนวนเต็มลบ");
        // }
        // กรณีตรวจสอบจำนวนเต็มศูนย์
        // if (number == 0) {
        // System.out.println("เป็นจำนวนเต็มศูนย์");
        // }
    }
}
