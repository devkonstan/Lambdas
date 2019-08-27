package Examples;

public class Examples {

    interface ToUpperCase {
        void invoke(String text);
    }

    interface Downloader {
        void download(String file);
    }

    interface Converter {
        void convert(String number); //gdzie number to liczba przekazana w postaci tekstowej
    }

    interface Calculator {
        int calculate(int a, int b);
    }

    public static void main(String[] args) {
        ToUpperCase toUpperCase = (String text) -> {
            System.out.println(text.toUpperCase());
        };
        toUpperCase.invoke("test upper");

        Downloader downloader = (String file) -> {
            System.out.println(file);
        };
        downloader.download("file");

        Converter converter = (String number) -> {
            System.out.println(number);
        };
        converter.convert("23");

        Calculator calculator = (int a, int b) -> a+b;
        System.out.println(calculator.calculate(5,3));
    }

}
