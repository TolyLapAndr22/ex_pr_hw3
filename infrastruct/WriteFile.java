package ex_pr_hw3.infrastruct;

import ex_pr_hw3.Exception.WriteFileEx;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public WriteFile() {
    }

    public void writeData(String data, String path) throws WriteFileEx {

        try(FileWriter fw = new FileWriter(path, true)) {
            fw.append(data);
            fw.append("\n");
        } catch (IOException e) {
            throw new WriteFileEx(e.getMessage());
        }
    }
}
