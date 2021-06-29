public class Part5 {
    public static void main(String[] args) {
        int sumI = 0;
        double numD;
        String s = args[0];
        if (isNumeric(s)) {
            numD = Double.parseDouble(s);
            if ((numD == (int) numD) && (numD >= 0)) {
                int numI = (int) numD;
                while (numI != 0) {
                    sumI = sumI + numI % 10;
                    numI = numI/10;
                }
            }
        }

        System.out.print(sumI);
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}
