import java.util.Scanner;

public class Main
{
//    Integer number = 0;

    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;
      //  System.out.println(container.count);

        Scanner sc = new Scanner(System.in);
        System.out.println(sumDigits(sc.nextInt()));


    }

    private static Integer sumDigits(Integer number)
    {
        int sumNum = 0;
        String numberString = String.valueOf(number);
        int numberLength = numberString.length();
        for (int i = 0; i < numberLength; i++){
           char ch =  numberString.charAt(i);
           sumNum += Character.getNumericValue(ch);
        }
        return sumNum;
    }
}
