public class Concatenate {
    public static void main(String[] args) {
        String hi = "Hi, ";
        String mom = "mom.";

        String res1 = hi + mom;
        System.out.println("Concatenación hi + mom: " + res1);
        String res2 = hi.concat(mom);
        System.out.println("Concatenación hi.concat(mom): " + res1);

    }
}
