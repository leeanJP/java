package chap12.generics;

public class ThreeDPrinterTest {
    public static void main(String[] args) {
        ThreeDPrinter printer = new ThreeDPrinter();

        Powder p1 = new Powder();
        printer.setMaterial(p1); //자동으로 형변환

        Powder p2 = (Powder) printer.getMaterial();
        //직접 형변환 해줘야함
    }
}
