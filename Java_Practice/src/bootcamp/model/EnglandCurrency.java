package bootcamp.model;

public class EnglandCurrency {
//    In England the currency is made up of pound, £, and pence, p, and there are eight coins in general circulation:
//            1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).
//    It is possible to make £2 in the following way:
//            1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p
//    How many different ways can £2 be made using any number of coins?

    public static void main(String[] args){
        final int oneP = 1;
        final int twoP = 2;
        final int fiveP = 5;
        final int tenP = 10;
        final int twentyP = 20;
        final int fiftyP = 50;
        final int pound = 100;
        final int twoPounds = 200;

        int count = 0;

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;
        int h = 0;

        for(h =0; h<=1; h++) {
            for (g = 0; g <= 2; g++) {
                for (f = 0; f <= 4; f++) {
                    for (e = 0; e <= 10; e++) {
                        for (d = 0; d <= 20; d++) {
                            for (c = 0; c <= 40; c++) {
                                for (b = 0; b <= 100; b++) {
                                    for (a = 0; a <= 201; a++) {
                                        int equation = (oneP * a) + (twoP * b) + (fiveP * c) + (tenP * d) + (twentyP * e) + (fiftyP * f) + (pound * g) + (twoPounds * h);
                                        if (equation == 200) {
                                            count += 1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println("Count = " + count);

    }
}
