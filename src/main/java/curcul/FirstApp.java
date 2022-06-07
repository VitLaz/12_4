package curcul;

public class FirstApp {

    public static void main(String[] args) {
        char symbol, anotherSymbol;
        symbol = 'w';

        boolean flag = false;

        byte abate = 10; // 8 бит
        short ashot= 1000; // 16 бит
        int aint = 40; // 32 бит

        Integer boxeb = 1; // по умолчанию null

        long along = 123L ; // 64 бит

        float afloat = 1.2F; // 23 бит
        double adoudle = 1.2D; //64 бит

        String aString = "dsfsdfsdfsdf";

        char[] array = new char[3];

        int maxValue = getMaxInNumber();

        System.out.println("max value :" + maxValue);
        System.out.println(summ(3,7));

        System.out.println(Byte.MAX_VALUE+1);
        System.out.println(Byte.MIN_VALUE-1);

        System.out.println(Integer.MAX_VALUE+1);
        System.out.println(Integer.MIN_VALUE-1);

        System.out.println(abate + aint);

        aint = (ashot == 10000)
                ? 20000
                : 30000;
        System.out.println(aint);

        int[] myArray ={6,3,3,1,1};

        for (int i=0;i<myArray.length;i++) {
            System.out.println(myArray[i]);
        }
        int buf;
        for (int i=0;i<myArray.length-1;i++) {
            if (myArray[i] > myArray[i+1]) {
                    buf = myArray[i];
                myArray[i] = myArray[i+1];
                myArray[i+1] = buf;
            }
        }





    }

    static int getMaxInNumber() {
        return Integer.MAX_VALUE;
    }

    static int summ (int fist, int second) {
        return fist + second;
    }
}
