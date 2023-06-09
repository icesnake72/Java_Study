import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        // 문자열 한줄 출력하기
        System.out.println("Hello world!!!");
        System.out.println("Welcome to" + " Java World");

        // 문자열 출력하기
        System.out.print("문자열 출력과 ");
        System.out.print("문자열 출력\n");

        // C의 printf 출력문과 같은 format 출력문
        System.out.printf("이것은 %c의 %s문과 비슷한 출력문입니다\n", 'C', "printf");     // 문자열과 문자열
        System.out.printf("%d + %d = %d\n", 1, 2, 1+2);                          // 문자열과 정수형의 보간
        System.out.printf("16진수와 친해지세요 : %x\n", 15);                          // 16 진수
        System.out.printf("이것은 8진수 출력 서식문자 입니다 : %o\n", 8);                 // 8진수
        System.out.printf("실수의 출력 : %f\n", 3.14F);                              // 실수
        System.out.printf("지수의 출력 : %e\n", 123.456F);                           // 지수
        System.out.printf("이렇게 하면 지수의 출력 : %g\n", 100000000000.00D);      // 지수
        System.out.printf("이렇게 하면 실수의 출력 : %g\n", 42.195F);                   // 지수 or 실수

        // String.format
        System.out.println("String.format 출력예");
        System.out.println(String.format("%d%d%d", 1,2,3));
        String strOut = String.format("%d%d%d", 4,5,6);
        System.out.println(String.format(strOut));


        // 출력문의 정렬
        System.out.printf("%5d\n", 1);
        System.out.printf("%5d\n", 12);
        System.out.printf("%5d\n", 123);

        System.out.printf("%6.2f\n", 1.23456);
        System.out.printf("%6.3f\n", 1.23456);
        System.out.printf("%6.4f\n", 1.23456);

        // 문자열 변수와 문자형 변수
        String strMyString = "My String";       // 문자열 형 변수
        char chWhat = 'a';                  // 문자형 변수 , 유니코드 2 Byte(16bit)
        System.out.println( Character.SIZE );

        // 정수형 데이터 타입
        byte minimum_size_data = 127;           // -128 ~ 127, 1 Byte(8bit)
        short small_size_data = 32_767;         // -32,768 ~ 32,768 2 Byte(16bit)
        int  normal_size_data = 2_000_000_000;   // -2^32 ~ 2^32 4 Byte(32bit)
        long big_size_data = 1_000_000_000_000_000_000L;     // -2^64 ~ 2^64 8 Byte(64bit)

        System.out.println(Byte.SIZE);
        System.out.println(Short.SIZE);
        System.out.println(Integer.SIZE);
        System.out.println(Long.SIZE);

        // 실수형 데이터 타입
        float pi = 3.14F;           // 4 byte (32bit)
        double dist = 42.195D;      // 8 byte (64bit)

        System.out.println(Float.SIZE);
        System.out.println(Double.SIZE);

        // logical type
        boolean isReal = true;      // true or false, logical type

        // 변수명 생성 규칙
        int _number = 10;   // 가능
        int $number = 20;   // 가능, $와 _외 모든 특수문자 사용불가
        int number = 20;    // 가능
        int myNewVar = 10;  // 카멜 표기법

        // 변수와 메모리

        // 자료형의 변환 : 묵시적 형변환, 명시적 형변환

        // 묵시적 형변환
        byte score = 100;
        int total = 0;
        total = score;  // 묵시적 형변환, 적은 용량의 타입을 상대적으로 큰 용량의 데이터 타입으로 변환할때
        float avg = total / 3; // 정수형을 실수형으로 변환할때, 주의 : 정수와 정수의 연산이므로 결과가 정수이고 최종적으로 대입될때 실수로 변환됨
        System.out.println(avg);    // 33.0 이 대입됨
        avg = total / 3.0f;         // 정수와 실수의 연산은 결과가 실수가 되며, 최종 대입되는 타입(여기서는 실수형)으로 변환되어 저장됨
        System.out.println(avg);    // 33.33333 이 대입됨

        // 명시적 형변환 : 주의, 데이터의 변경이 발생할 수 있다.
        total = 300;
        score = (byte)total;        // ()안에 변환하고자하는 데이터 타입을 명시하여 준다
        System.out.println(score);

        score = (byte)128;  // 128부터 1씩증가하며 대입해보며, 결과를 관찰해보자
        System.out.println(score);

        avg = 90.9F;
        total = (int)avg;           // 0.9 데이터의 손실이 발생한다.
        System.out.println(total);  //

        // 데이터의 입력
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("나이를 입력하세요 >>> ");
//        byte age = scanner.nextByte();
//        System.out.printf("당신의 나이는 %d살 입니다.", age);
//        scanner.close();    // Scanner 객체를 사용후에는 반드시 close()메소드를 호출해야됨!!!
    }
}