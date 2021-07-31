public class MainClass {
    public static void main(String[] args) {
        System.out.println(StringUtils.betterString("Ahmed", "Mohamed", (s1, s2)->s1.length() > s2.length()));

        System.out.println(StringUtils.onlyAlphabet("Ahmed"));
        System.out.println(StringUtils.onlyAlphabet("Ahm3"));
    }
}
