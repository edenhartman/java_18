package UI;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class UIManager {

    private StringBuilder m_menu;
    private int m_requestedChoise;

    public static void main(String[] args) throws FileNotFoundException {
        UIManager manager = new UIManager();
        try {
            manager.init();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        manager.run();


    }

    private void run() {
    }

    private void init() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("out/production/EnigmaEx/UI/UItext.txt"));
        m_menu = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }


    }


}
