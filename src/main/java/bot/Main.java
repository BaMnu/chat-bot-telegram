package bot;

import com.google.common.base.Utf8;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Storage text = new Storage();
        try {
            text.rndComment();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
