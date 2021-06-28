public class Part7 {
    public static void main(String[] args) {
        System.out.print(columnSequenceNumber(args[0]));

    }

    public static int columnSequenceNumber(String arg) {
        char[] strToArray = arg.toCharArray(); // array String to array char
        int numbOfColumn = 0;
        int numb;
        for (int i = strToArray.length - 1; i >= 0; i--) {
            switch (strToArray[(strToArray.length - 1) - i]) {
                case 'A':
                    numb = 1;
                    break;
                case 'B':
                    numb = 2;
                    break;
                case 'C':
                    numb = 3;
                    break;
                case 'D':
                    numb = 4;
                    break;
                case 'E':
                    numb = 5;
                    break;
                case 'F':
                    numb = 6;
                    break;
                case 'G':
                    numb = 7;
                    break;
                case 'H':
                    numb = 8;
                    break;
                case 'I':
                    numb = 9;
                    break;
                case 'J':
                    numb = 10;
                    break;
                case 'K':
                    numb = 11;
                    break;
                case 'L':
                    numb = 12;
                    break;
                case 'M':
                    numb = 13;
                    break;
                case 'N':
                    numb = 14;
                    break;
                case 'O':
                    numb = 15;
                    break;
                case 'P':
                    numb = 16;
                    break;
                case 'Q':
                    numb = 17;
                    break;
                case 'R':
                    numb = 18;
                    break;
                case 'S':
                    numb = 19;
                    break;
                case 'T':
                    numb = 20;
                    break;
                case 'U':
                    numb = 21;
                    break;
                case 'V':
                    numb = 22;
                    break;
                case 'W':
                    numb = 23;
                    break;
                case 'X':
                    numb = 24;
                    break;
                case 'Y':
                    numb = 25;
                    break;
                case 'Z':
                    numb = 26;
                    break;

                default:
                    numb = -1;
                    numbOfColumn = 0;
                    break;
            }
            if (numb > 0)
                numbOfColumn += numb * (int) Math.pow(26, i);
        }
        if (numbOfColumn > 0) {
            return numbOfColumn;
        } else return -1;
    }
}