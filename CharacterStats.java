public class CharacterStats {
    public static void main(String[] args) {

        String s = "Java123@AI";

        long digits = s.chars().filter(Character::isDigit).count();
        long letters = s.chars().filter(Character::isLetter).count();
        long others = s.length() - digits - letters;

        System.out.println("Digits: " + digits);
        System.out.println("Letters: " + letters);
        System.out.println("Others: " + others);
    }
}
