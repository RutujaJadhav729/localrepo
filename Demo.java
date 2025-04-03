public class Demo {
    //Average of Numbers
    static int average(int... a){
        //length of the number
        int numberLength = a.length;

        int sumVariable = 0;
        for (int sum : a){
            sumVariable += sum;
        }
        return (sumVariable/numberLength);
    }

    //Sum of the N numbers
    static double sumNumbers(double... b){
        double sumOfNumbers = 0;
        for (double sumNumbers : b){
            sumOfNumbers += sumNumbers;
        }
        return sumOfNumbers;
    }
    public static void main(String[] args) {
        System.out.println("Average of the given number is:- "+ average(2,9,0,5,33,45,22,24));
        System.out.println("Average of the given number is:- "+ average(90,89,44,2,3,2,1,4,89,90,0));
        System.out.println("Sum of the N numbers:- "+ sumNumbers(92,90.3,98.4,8));
    }
}