public class UppercaseCount {
    public static void main(String[] args) {
        String s = "JaVaStreamAPI";

        long count = s.chars()
                .filter(Character::isUpperCase)
                .count();

        System.out.println(count);
    }
}
