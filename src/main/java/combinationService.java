import dto.keyboardDto;

import java.util.ArrayList;
import java.util.List;

public class combinationService {


     /**
     * This method get combination list from  two string list.
      * @aStringlist args list<string> 1
      * @aStringlist args list<string> 1
      * @return combination list<string>.
     */
    public List<String> getCombination(List<String> aStringlist,List<String> bStringlist)
    {
        List<String> result=new ArrayList<>();
        if (aStringlist.size()==0 || bStringlist.size()==0) {
            result.addAll(aStringlist);
            result.addAll(bStringlist);
        }
        else{

            for(int i=0;i<aStringlist.size();i++)
            {
                for(int j=0;j<bStringlist.size();j++)
                {
                    result.add((aStringlist.get(i)+bStringlist.get(j)).toLowerCase());
                }

            }

        }
        return result;
    }


    /**
     * This method get combination list from number,if number more than 9 ,then convert to two digit,
     * sample as 56 , convert to 5 to 6.
     * @arrayData args list<string> ,init number to letters mapping
     * @idx args  input number
     * @return list<string>.
     */
    List<String> getDigitList(List<keyboardDto> arrayData,int idx)
    {
        if (idx<10)
            return arrayData.get(idx).charList;
        else{
            int leftnum=idx/10;
            int rightnum=idx% 10;

            return getCombination(arrayData.get(leftnum).charList,
                    arrayData.get(rightnum).charList);


        }

    }






}
