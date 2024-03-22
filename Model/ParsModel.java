package ex_pr_hw3.Model;

import ex_pr_hw3.Data.*;
import ex_pr_hw3.Exception.ParseDataEx;
import ex_pr_hw3.Exception.WriteFileEx;
import ex_pr_hw3.infrastruct.WriteFile;
import oop_l_Shape_mat.Shapes.Shapes;


import java.util.ArrayList;
import java.util.List;

public class ParsModel implements Model {

    public void Write (String nameF, String DataW) throws WriteFileEx {
        WriteFile wf = new WriteFile();
       //wf.writeData(DataW,nameF);
        wf.writeData(DataW,nameF);
    }
public String GenerData (List<dataStr> MassData){

    StringBuilder str= new StringBuilder();
dataStr Data;
    for (int i=0; i<MassData.size();i++) {
        Data = (dataStr) MassData.get(i);
        str.append(Data.getString()+" ");
    }

    return str.toString();
}

public List parsStr(String str)throws  ParseDataEx{
    //dataStr[] MassData=new dataStr;
    List<dataStr> MassData = new ArrayList<>();
    String arrStr[]=str.split(" ");
    if(arrStr.length<6)throw new ParseDataEx("Данных не достаточно");
    if(arrStr.length>6)throw new ParseDataEx("Данных больше требуемых");
    MassData.add(setFIO(arrStr[0],arrStr[1],arrStr[2]));
    MassData.add(setBirthday(arrStr[3]));
    MassData.add(setTel(arrStr[4]));
    MassData.add(setGender(arrStr[5]));

    return MassData;
}
    @Override
    public dataStr setBirthday(String Birthday) throws ParseDataEx {
        dataStr BD = DataBirthday.create(Birthday);
         return BD;
    }

    @Override
    public dataStr setTel(String Tel) throws ParseDataEx {
        dataStr TEL = DataTel.create(Tel);
        return TEL;
    }

    @Override
    public dataStr setGender(String Gender) throws ParseDataEx {
        dataStr GD = DataPol.create(Gender);
        return GD;
    }

    @Override
    public dataStr setFIO(String F, String I, String O) throws ParseDataEx {
        StringBuilder str= new StringBuilder();
        str.append(F+" ");
        str.append(I+" ");
        str.append(O);


        dataStr FIO = DataName.create(str.toString());
        return FIO;
    }

    @Override
    public String DataResult() {
        return null;
    }
}
