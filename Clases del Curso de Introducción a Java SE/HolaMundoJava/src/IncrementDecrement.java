public class IncrementDecrement {

    public static void main(String[] args) {
        int lives = 5;
        lives--;
        System.out.println(lives);

        lives++;
        System.out.println(lives);

        //Prefija
        //Gana un regalo por ganar una vida
        int gift = 100 + lives++; //posfijo
        System.out.println(gift);
        System.out.println(lives);
    }
}
