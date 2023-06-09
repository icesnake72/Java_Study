import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("제어문");

        int num1 = 10;
        int num2 = 5;

        // 조건이 참이면 바로 아래 한 문장을 수행
        if ( num1 > num2 )
            System.out.println(true);

        // 조건이 참이면 바로 아래 하나의 코드 블럭을 수행
        if ( num1 > num2 )
        {
            System.out.println("num1이 num2보다 큽니다.");
            System.out.println("num2는 num1보다 작습니다.");
        }

        // if ~ else 문
        if ( num1 > num2 )
            System.out.println("num1이 num2보다 큽니다.");    // 조건이 참이면 바로 아래 한 문장을 수행
        else
            System.out.println("num1이 num2보다 큽니다.");    // 조건이 거짓이면 else 바로 아래 한 문장을 수행

        if ( (num1 / 2) == 0 )
        {
            System.out.println("num1은 2로 나누어 떨어졌으므로, ");
            System.out.println("num1은 짝수입니다.");
        }
        else
        {
            System.out.println("num1은 2로 나누어 떨어지지 않았으므로, ");
            System.out.println("num1은 홀수입니다.");
        }

        // if ~ else if ~ else if ... else 문
        System.out.print("점수를 입력하세요 >>> ");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        scanner.close();

        if ( score >= 95 )
            System.out.println("A+");
        else if ( score >= 90 )
            System.out.println("A");
        else if ( score >= 85 )
            System.out.println("B+");
        else if ( score >= 80 )
            System.out.println("B");
        else if ( score >= 75 )
            System.out.println("C+");
        else if ( score >= 70 )
            System.out.println("C");
        else if ( score >= 60 )
            System.out.println("D");
        else
            System.out.println("F");

        String fruit = "apple";
        if ( fruit == "watermelon")
            System.out.printf("%s은 수박입니다", fruit);
        else if ( fruit=="strawberry" )
            System.out.printf("%s은 딸기입니다", fruit);
        else if ( fruit=="apple" )
            System.out.printf("%s은 사과입니다", fruit);
        else if ( fruit=="grape" )
            System.out.printf("%s은 포도입니다", fruit);
        else
            System.out.println("알 수 없는 과일입니다.");

        System.out.println();   // 한 줄 건너뛰기

        // switch ~ case 문
        switch ( fruit )
        {
            case "watermelon":
                System.out.printf("%s은 수박입니다", fruit);
                break;

            case "strawberry":
                System.out.printf("%s은 딸기입니다", fruit);
                break;

            case "apple":
                System.out.printf("%s은 사과입니다", fruit);
                break;

            case "grape":
                System.out.printf("%s은 포도입니다", fruit);
                break;

            default:
                System.out.println("알 수 없는 과일입니다.");
        }

        int menu = 1;
        switch ( menu )
        {
            case 1:
                System.out.println("아메리카노");
                break;

            case 2:
                System.out.println("아이스 아메리카노");
                break;

            case 3:
                System.out.println("라떼");
                break;

            case 4:
                System.out.println("아이스 라떼");
                break;

            default:
                System.out.println("없는 메뉴입니다.");
        }
    }
}