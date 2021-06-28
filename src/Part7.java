public class Part7 {
    public static void main(String[] args) {


        System.out.print(args[0]);
        System.out.print(" ==> ");
        System.out.print(columnSequenceNumber(args[0]));
        System.out.print(" ==> ");
        System.out.print(columnLetterNumber(columnSequenceNumber(args[0])));

//        if (columnLetterNumber(columnSequenceNumber(args[0])) != null)
//            System.out.print(columnLetterNumber(Integer.parseInt(args[0])));

//        System.out.println(rightSideColumnDefining(args[0]));

    }

    public static String rightSideColumnDefining(String arg) {
        return columnLetterNumber(columnSequenceNumber(arg) + 1);
    }

    public static String columnLetterNumber(int number) {
        int wholeNumb;
        int redundat;
        String letter = "";
        String str = "";
        while (number > 0) {
            if (number % 26 == 0) {
                letter = "Z";
                number = (int) (number / 26)-1;
            } else {
                wholeNumb = (int) number / 26;
                redundat = number % 26;
                switch (redundat) {
                    case 1:
                        letter = "A";
                        break;
                    case 2:
                        letter = "B";
                        break;
                    case 3:
                        letter = "C";
                        break;
                    case 4:
                        letter = "D";
                        break;
                    case 5:
                        letter = "E";
                        break;
                    case 6:
                        letter = "F";
                        break;
                    case 7:
                        letter = "G";
                        break;
                    case 8:
                        letter = "H";
                        break;
                    case 9:
                        letter = "I";
                        break;
                    case 10:
                        letter = "J";
                        break;
                    case 11:
                        letter = "K";
                        break;
                    case 12:
                        letter = "L";
                        break;
                    case 13:
                        letter = "M";
                        break;
                    case 14:
                        letter = "N";
                        break;
                    case 15:
                        letter = "O";
                        break;
                    case 16:
                        letter = "P";
                        break;
                    case 17:
                        letter = "Q";
                        break;
                    case 18:
                        letter = "R";
                        break;
                    case 19:
                        letter = "S";
                        break;
                    case 20:
                        letter = "T";
                        break;
                    case 21:
                        letter = "U";
                        break;
                    case 22:
                        letter = "V";
                        break;
                    case 23:
                        letter = "W";
                        break;
                    case 24:
                        letter = "X";
                        break;
                    case 25:
                        letter = "Y";
                        break;

                    default:
                        break;
                }
                number = wholeNumb;
            }
            str = str + letter;
        }
        return new StringBuffer(str).reverse().toString();
    }

    public static int columnSequenceNumber(String number) {
        char[] strToArray = number.toCharArray(); // array String to array char
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