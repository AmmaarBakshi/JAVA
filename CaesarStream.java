public class CaesarStream {

    public static void main(String[] args){

        String text = "HELLO";

        String encrypted =
            text.chars()
                .map(c -> c+3)
                .collect(
                    StringBuilder::new,
                    StringBuilder::appendCodePoint,
                    StringBuilder::append
                )
                .toString();

        System.out.println(encrypted);
    }
}
