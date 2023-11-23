package DAA;

public class Q2_PowerFunction {


    public static int power(int x, int y)
//    {
//        int temp;
//        if (y == 0)
//            return 1;
//        temp = power(x, y / 2);
//
//        if (y % 2 == 0)
//            return temp * temp;
//        else {
//            if (y > 0)
//                return x * temp * temp;
//            else
//                return (temp * temp) / x;
//        }
    {
        int result =1;
        if(y==0){
            return result;
        }
        else{
            for(int i = 0;i<y;i++){
                result *= x;
            }
        }
        return result;
    }

    // Driver code
    public static void main(String[] args)
    {
        int x = 2;
        int y = 4;
        System.out.println(power(x, y));
    }
}
