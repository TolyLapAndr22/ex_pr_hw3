package ex_pr_hw3.Program;

import java.util.Scanner;

public class View {
    Scanner in= new Scanner(System.in);

    public String getValue(String str){
        System.out.printf("%s",str);
        return in.nextLine();

    }
    public void printData(String title){
        System.out.printf("%s\n", title);

    }
}
