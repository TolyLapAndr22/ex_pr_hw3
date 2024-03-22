package ex_pr_hw3.Data;

import ex_pr_hw3.Exception.ParseDataEx;

public class DataName extends dataStr{
    protected String LastName;
    protected String[] FIO;
    public DataName() {
    }
    public static DataName create(String name) throws ParseDataEx {
        DataName dName = new DataName();
        if (dName.Pars(name)) throw new ParseDataEx("ФИО не в формате");
        dName.setDataString(name);
        dName.LastName = dName.FIO[0];
        return dName;
    }
    @Override
    public boolean Pars(String str) {
       this.FIO=str.split(" ");
       if(FIO.length==3 ){
           for (int i = 0; i < FIO.length; i++) {
               char[] chars = FIO[i].toCharArray();
               for (char c : chars) {
                   if(!Character.isLetter(c)) {
                       return true;
                   }
               }
           }

       }else{
           return true;
       }

        return false;
    }

    public String getLastName() {
        return LastName;
    }
}
