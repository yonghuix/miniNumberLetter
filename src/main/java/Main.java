import dto.keyboardDto;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("This app is Convert the digits from 0 to 99 into letters,input # then exit");

        initService initService=new initService();

        List<keyboardDto> arrayData= initService.getInitList();

        combinationService combinationService=new combinationService();

        String mInput="";
        Scanner input = new Scanner(System.in);
        do{

            System.out.println("You can input from 0 to 99,sample as 2,3");
            System.out.print("Input：arr[]=");
            mInput=input.next();

            int k=mInput.indexOf(",");
            if (k==-1) {
                System.out.println("Input error ,must input sample as 2,3");
                continue;
            }
            else{
                System.out.println("You input："+mInput);

                String lefter=mInput.substring(0,k);
                String righter=mInput.substring(k+1);


                List<String> result=combinationService.getCombination(combinationService.getDigitList(arrayData,Integer.valueOf(lefter)),
                        combinationService.getDigitList(arrayData,Integer.valueOf(righter)));
                System.out.println(result);
            }
        } while(!mInput.equals("#"));
        System.out.println("You input \"#\"，app exit！");
        input.close();

    }

}
