public class Part6 {

    public static void main(String[] args) {
        int numOfPrime = Integer.parseInt(args[0]);
        System.out.print(primeNumbers(numOfPrime));
    }

    public static String primeNumbers(int n) {
        int i = 1;
        int num = 0;
        boolean achieve = true;
        int primeCount = 0;
        String primeNumbers = "";
        StringBuilder stringBuilder = new StringBuilder(primeNumbers);
        while (achieve) {

            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                if (primeCount == n-1) {
                    stringBuilder.append(i);
//                    primeNumbers = primeNumbers + i;

                } else {
                    stringBuilder.append(i+" ");
//                    primeNumbers = primeNumbers + i + " ";

                }
                primeCount++;
            }
            i++;
            if (primeCount == n) {
                achieve = false;
            }

        }
        return stringBuilder.toString();
    }
}

