package ex_pr_hw3.Data;

import ex_pr_hw3.Exception.ParseDataEx;

public class DataTel extends dataStr{
    public static DataTel create(String name) throws ParseDataEx {
        DataTel dTel = new DataTel();
        if (dTel.Pars(name)) throw new ParseDataEx("Телефон не в формате");
        dTel.setDataString(name);

        return dTel;
    }
    @Override
    public boolean Pars(String str) {
        boolean isOnlyDigits =false ;
        for(int i = 0; i < str.length() && !isOnlyDigits; i++) {
            if(!Character.isDigit(str.charAt(i))) {
                isOnlyDigits = true;
            }
        }

        return isOnlyDigits;
    }
}
