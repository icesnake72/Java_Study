public class Main {
    public static void main(String[] args)
    {
        /**
         *
         *  연산자 (Operators)
         *
         * */


        // 부호 연산자, +, -
        int val = 100;
        float real_val = 10.0F;

        int res = -val;
        float res_f = -real_val;

        System.out.printf("val=%d, res=%d\n", val, res);                    // -를 한다고 해서 원래의 값 자체가 바뀌는것은 아님
        System.out.printf("real_val=%f, res_f=%f\n", real_val, res_f);

        System.out.println("--------------------------------------");
        System.out.println("증감 연산자");
        // 증감 연산자, ++, --
        res = ++val;
        res_f = ++real_val;
        System.out.printf("res=%d, val=%d\n", res, val);
        System.out.printf("res=%f, val=%f\n", res_f, real_val);

        res = --val;
        res_f = --real_val;
        System.out.printf("res=%d, val=%d\n", res, val);
        System.out.printf("res=%f, val=%f\n", res_f, real_val);

        System.out.printf("val=%d\n", val++);   // 출력문이 선행된 후 val값이 증가된다.
        System.out.printf("val=%d\n", --val);   // val값을 감소한 후 출력문이 실행된다.

        System.out.println("--------------------------------------");
        System.out.println("논리 부정 연산자");
        // 논리 부정 연산자, !
        boolean torf = true;
        System.out.println("torf=" + torf);

        torf = !torf;
        System.out.println("torf=" + torf);

        System.out.println("--------------------------------------");
        System.out.println("사칙 연산자");
        // 산술 연산자, +,-,*,/,%
        res = val + 10; System.out.println("res = val + 10 ===> " + res);
        res = val - 10; System.out.println("res = val - 10 ===> " + res);
        res = val * 10; System.out.println("res = val * 10 ===> " + res);
        res = val / 10; System.out.println("res = val / 10 ===> " + res);
        res = val % 10; System.out.println("res = val % 10 ===> " + res);

        res_f = real_val / 7;   System.out.println("실수의 나누기 연산 : " + res_f);
        res_f = real_val % 7;   System.out.println("실수의 나머지 연산 : " + res_f);      // 실수형의 연산에도 나머지 연산은 수행됨

        System.out.println("--------------------------------------");
        System.out.println("대입 연산자");
        // 대입 연산자, =, +=, -=, *=, /=, %=
        res += 10; System.out.println("res += 10 ===> " + res);
        res -= 5; System.out.println("res -= 10 ===> " + res);
        res *= 5; System.out.println("res *= 10 ===> " + res);
        res /= 5; System.out.println("res /= 10 ===> " + res);
        res %= 5; System.out.println("res %= 10 ===> " + res);

        System.out.println("--------------------------------------");
        System.out.println("관계 연산자");
        // 관계(비교) 연산자, <, <=, >, >=, ==, !=   , 결과값은 true or false
        res = 10;   val = 5;
        System.out.println("res > val : " + (res > val));  // true, 10 > 5
        System.out.println("res >= val : " + (res >= val)); // true, 10 >= 5
        System.out.println("res < val : " + (res < val));  // false, 10 < 5 ===> false
        System.out.println("res <= val : " + (res <= val)); // false, 10 <= 5 ===> false
        System.out.println("res == val : " + (res == val)); // false, 10 == 5 ===> false
        System.out.println("res != val : " + (res != val)); // true, 10 != 5

        System.out.println("--------------------------------------");
        System.out.println("논리 연산자");
        // 논리 연산자, &&(AND), ||(OR), ^(XOR), !(NOT)
        boolean a = true, b = false;
        System.out.println("a && b : " + (a && b));     // AND 연산
        System.out.println("a || b : " + (a || b));     // OR 연산
        System.out.println("a ^ b : " + (a ^ b));       // XOR 연산
        System.out.println("!a : " + !a );              // NOT 연산

        System.out.println("--------------------------------------");
        System.out.println("삼항 연산자");

        res = ( a && b) ? 10 : 100;
        System.out.println("res = ( a && b) ? 10 : 100; ===> res = " + res );
    }


}