public class PoolChapter4TestDrive {
    public static void main(String[] args) {
        PoolChapter4[] obs = new PoolChapter4[6];

        int y = 1;
        int x = 0;
        int result = 0;

        while (x < 6) {
            obs[x] = new PoolChapter4();
            obs[x].ivar = y;
            y = y * 10;
            x++;
        }

        x = 6;
        while (x > 0) {
            x--;
            result = result + obs[x].doStuff(x);
        }
        System.out.println("Результат: " + result);
    }
}
