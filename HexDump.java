public class HexDump {

    public static void main(String[] args){

        String text="JAVA";

        text.chars()
            .mapToObj(Integer::toHexString)
            .forEach(System.out::println);
    }
}
