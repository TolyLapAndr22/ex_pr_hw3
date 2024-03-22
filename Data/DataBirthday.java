package ex_pr_hw3.Data;

import ex_pr_hw3.Exception.ParseDataEx;


import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


public class DataBirthday extends dataStr{

    public DataBirthday() {
    }
    public static DataBirthday create(String name) throws ParseDataEx{
        DataBirthday dBD = new DataBirthday();
        if (dBD.Pars(name)) throw new ParseDataEx("день рождения не в формате");
        dBD.setDataString(name);
        return dBD;
    }

    @Override
    public boolean Pars(String str) {

        try {
            DateTimeFormatter dateFormatter =  DateTimeFormatter.ofPattern("dd.MM.yyyy");
            dateFormatter.parse(str);
        } catch (DateTimeParseException e) {
            return true;
        }
        return false;
//
    }

    @Override
    public String getString() {
        return super.getString();
    }
}
