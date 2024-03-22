package ex_pr_hw3.Data;

public abstract class dataStr implements ParsData {
    private String dataString;

    public void setDataString(String dataString) {
        this.dataString = dataString;
    }

    public String getString(){
        return this.dataString;
    }
}
