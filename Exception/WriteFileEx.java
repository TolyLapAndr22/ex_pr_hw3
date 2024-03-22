package ex_pr_hw3.Exception;

import java.io.IOException;

public class WriteFileEx extends IOException {
    public WriteFileEx(String message) {
        super(message);
    }
}
