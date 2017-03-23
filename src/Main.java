
public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = 1;
        for (int i = 10; i > 0; i--)
        {
            a--;

            System.out.println(i + " негритят сидело за столом.");

            if (a == 0)
            {
                System.out.println("Последний ушел и негритята закончились");
                break;
            }

            System.out.println("Один ушел и их осталось " + a + ". (всего ушло " + b++ + " человек)");
        }
        
    }
}
