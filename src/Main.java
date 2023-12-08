public class Main {
    public static void main(String[] args) {

        double[] numbers = {1.4, 4.2, -45.5, 25.8, -63.2, 21.1, 34.4, 566.3, -8.6, -23.1, 64.4, 10.2, 12.1, 18.2, 79.9};

        int kolvo = 0;
        double sum = 0;
        boolean minus = false;

        for (double num : numbers) {

            if (!minus) {
                if (num < 0) {
                    minus = true;
                }
            } else if (num > 0) {
                sum = sum + num;
                //resolt += num
                kolvo++;
            }
        }
        System.out.println(sum / kolvo);
    }
}
