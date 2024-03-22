package ex_pr_hw3.Program;

import ex_pr_hw3.Data.DataName;
import ex_pr_hw3.Data.dataStr;
import ex_pr_hw3.Exception.ParseDataEx;
import ex_pr_hw3.Exception.WriteFileEx;
import ex_pr_hw3.Model.ParsModel;


public class Present {
    ParsModel m = new ParsModel();
    View v= new View();
String[]arrStrData;
    public Present(ParsModel m, View v) {
        this.m = m;
        this.v = v;
    }

    public String[] GetString() throws ParseDataEx {
        String[] arrStr = new String[2];
        DataName dataF;
        String Data = v.getValue("Введите данные :Фамилия Имя Отчество дата _ рождения номер _ телефона пол\n");
        String DataParsed = m.GenerData(m.parsStr(Data));
       // v.printData(DataParsed);
        dataF = (DataName)m.parsStr(Data).get(0);
        arrStr[0]=dataF.getLastName();//имя файла
        arrStr[1]=DataParsed; /// что туда пишем
return arrStr;
    }
    public void WriteF(String[] dw) throws WriteFileEx {
        m.Write(dw[0],dw[1]);
        v.printData("Данные : "+dw[1]);
        v.printData("Записаны в файл - "+dw[0]);
    }
}
