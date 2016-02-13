public class Dog {
   protected int size;
   protected String name;

    void bark(int numOfBarks) {
        /*while (numOfBarks > 0) {
            System.out.println("Гав!");
            numOfBarks --;
        }
        if (size > 60) {
            System.out.println("Гав! Гав!");

        }else if (size > 14) {
            System.out.println("Вуф! Вуф1");

        }else {
            System.out.println("Тяф! Тяф!");
        }*/
        while (numOfBarks > 0) {
            if (size > 60) {
                System.out.println("Гав! Гав!");

            }else if (size > 14) {
                System.out.println("Вуф! Вуф!");

            } else {
                System.out.println("Тяф! Тяф!");
            }

            numOfBarks--;
        }

    }
}
