package chap13;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterEX {
    public static void main(String[] args) {
        InputStreamReader in = new InputStreamReader(System.in);

        FileWriter fout = null;
        int c;
        try {
            fout = new FileWriter("c:\\JP\\test1.txt");

            while ((c = in.read())!= -1){
                fout.write(c); //키보드로부터 입력받은 문자를 파일에 씀
            }
            in.close();
            fout.close();
        }catch (IOException e){
            System.out.println(e);
        }


    }
}
