import dto.keyboardDto;

import java.util.ArrayList;
import java.util.List;

public class initService {

     /**
     * This method init number to digit mapping,
     * @return list<string>.
     */
    public List<keyboardDto> getInitList()
    {
        String[] letters={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O",
                "P","Q","R","S","T","U","V","W","X","Y","Z"};

        List<keyboardDto> result=new ArrayList<>();
        int idx=0;
        for(int i=0;i<=9;i++) {
            if (i<2) {
                keyboardDto dto1=new keyboardDto();
                dto1.keyValue=i;
                dto1.charList=new ArrayList<>();
                result.add(dto1);
            }
            else if (i<7 || i==8) {
                keyboardDto dto2 = new keyboardDto();
                dto2.keyValue = i;
                dto2.charList = new ArrayList<>();
                for(int k=0;k<3;k++) {
                    dto2.charList.add(letters[idx+k]);
                }
                idx=idx+3;
                result.add(dto2);
            }
            else{
                keyboardDto dto3 = new keyboardDto();
                dto3.keyValue = i;
                dto3.charList = new ArrayList<>();

                for(int k=0;k<4;k++) {
                    dto3.charList.add(letters[idx+k]);
                }
                idx=idx+4;

                result.add(dto3);
            }

        }

        return result;
    }



}
