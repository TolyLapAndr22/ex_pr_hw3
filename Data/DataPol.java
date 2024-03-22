package ex_pr_hw3.Data;

import ex_pr_hw3.Exception.ParseDataEx;

public class DataPol extends dataStr{
    public static DataPol create(String name) throws ParseDataEx {
        DataPol dPol = new DataPol();
        if (dPol.Pars(name)) throw new ParseDataEx("ПОЛ не в формате");
        dPol.setDataString(name);

        return dPol;
    }
    @Override
    public boolean Pars(String str) {
        if(str.contains("f")||str.contains("m")) {
            return false;
        }
        return true;
    }

}
