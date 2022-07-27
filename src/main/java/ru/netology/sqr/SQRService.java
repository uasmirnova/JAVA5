package ru.netology.sqr;

public class SQRService {

    public int calculateSQR(int limit1, int limit2) {
        int sqrResult = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr >= limit1) {
                if (sqr <= limit2) {
                    sqrResult++;
                }
            }
        }
        return sqrResult;
    }
}
