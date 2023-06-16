import java.util.Scanner;

public class MyClass {
    public static void main(String[] args)
    {
        int count = 0;
        int total = 0;
        while ( count < 10 )
        {
            ++count;
            total += count;
            System.out.println( total );
        }

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("문자열을 입력하세요 : ");
            String strInput = scanner.nextLine();
            strInput = strInput.toUpperCase();
            if ( strInput.equals("X") )
                break;

            String strOutput = String.format("입력 : %s", strInput);
            System.out.println(strOutput);
        } while ( true );

        System.out.println("while() 반복문을 빠져나왔습니다.");
        scanner.close();

        for(int i=0; i<10; i++)
        {
            System.out.println( i );
        }

        String strTest = "abcdefghij";
        for(char ch : strTest.toCharArray())
        {
            System.out.println(ch);
        }
    }
}