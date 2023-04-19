// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        //for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            //System.out.println("i = " + i);
        //}
        System.out.println(helloName("Shruthi"));//HiHi
        System.out.println(stringTimes("Hi", 4));//HiHi
        System.out.println(stringTimes("H", 2));//HiHi
        System.out.println(stringTimes("Code", 2));//HiHi

    }

    public static String helloName(String name) {

        return "Hello " + name;
    }

    public static String stringTimes(String str, int n) {
        String result = "";
        for (int i=1; i<=n; i++) {
            result = result + str;  // could use += here
        }
        return result;
    }


}