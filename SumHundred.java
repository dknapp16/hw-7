public class SumHundred {



    public static int sum(int firstInput, int secondInput, int priorResult){
        int result=firstInput + secondInput + priorResult;

        return result;
    }

    public static void output(int finalResult, int iterations){

        System.out.println("The frist result was greater than 100 was" + finalResult+ "and took"+ iterations + "to complete");

    }



    public static void main(String args[]) {

     int trackResult= (sum(10,30,40));
while (trackResult>100){
System.out.println(trackResult);
    trackResult++;
}


    }
    }