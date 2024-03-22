package ex_pr_hw3.Program;

import ex_pr_hw3.Exception.ParseDataEx;
import ex_pr_hw3.Exception.WriteFileEx;
import ex_pr_hw3.Model.ParsModel;

public class Program {
    public static void main(String[] args) throws ParseDataEx, WriteFileEx {
        ParsModel m = new ParsModel();
        View v= new View();
        var p = new Present(m,v);

        p.WriteF(p.GetString());
    }
}
