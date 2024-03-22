package ex_pr_hw3.Model;

import ex_pr_hw3.Data.dataStr;
import ex_pr_hw3.Exception.ParseDataEx;

public interface Model {
    dataStr setBirthday(String Birthday) throws ParseDataEx;
    dataStr setTel(String Tel)throws ParseDataEx;
    dataStr setGender(String Gender)throws ParseDataEx;
    dataStr setFIO(String F,String I, String O)throws ParseDataEx;
    String DataResult();

   
}
