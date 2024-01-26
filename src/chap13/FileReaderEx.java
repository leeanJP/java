package chap13;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) {
        FileReader in = null;
        try {
            in = new FileReader("c:\\JP\\test.txt"); //문자 입력 스트림 생성
            int c;
            while ((c = in.read()) != -1){ //한 문자씩 파일을 읽어옴
                System.out.print((char)c);
            }
            in.close();

        }catch (IOException e ){
            System.out.println("파일 입출력 오류");
        }
    }
}
