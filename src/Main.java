public class Main {
    public static String chessBoardCoord(int a,int b) {
    String letters = "ABCDEFGH";
    String numbers = "87654321";
        if ((a > 7)|| (b > 7)) {
            return null;
        } else {
            return (Character.toString(letters.charAt(a)) + numbers.charAt(b));
        }
    }
    public static String chessBoardCoord2(int a,int b) {
        String letters2 = "ABCDEFGH";
        String numbers2 = "12345678";
        if ((a > 7)|| (b > 7)) {
            return null;
        } else {
            return (Character.toString(letters2.charAt(a)) + numbers2.charAt(b));
        }
    }
    public static String chessBoardCoord3(int a,int b) {
        String letters2 = "HGFEDCBA";
        String numbers2 = "12345678";
        if ((a > 7)|| (b > 7)) {
            return null;
        } else {
            return (Character.toString(letters2.charAt(a)) + numbers2.charAt(b));
        }
    }
    public static String chessBoardCoord4(int a,int b) {
        String letters2 = "HGFEDCBA";
        String numbers2 = "87654321";
        if ((a > 7)|| (b > 7)) {
            return null;
        } else {
            return (Character.toString(letters2.charAt(a)) + numbers2.charAt(b));
        }
    }
    public static void main(String[] args) {
        //////////////////////////////////////////////////////////
        System.out.println("Доска №1: 0 градусов и 360 градусов");
            String [] [] array = new String [8] [8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if ((i + j) % 2 == 0) array [i] [j] = chessBoardCoord( j, i);
                else array [i] [j] = chessBoardCoord( j, i);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array [0].length; j++) {
                System.out.print(" " + array [i] [j] + " ");
            }
            System.out.println();
        }
        //////////////////////////////////////////////////////////
        System.out.println("Доска №2: 90 градусов");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array [0].length; j++) {
                if ((i + j) % 2 == 0) array [j] [i] = chessBoardCoord2( j, i);
                else array [j] [i] = chessBoardCoord2( j, i);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array [0].length; j++) {
                System.out.print(" " + array [i] [j] + " ");
            }
            System.out.println();
        }
        //////////////////////////////////////////////////////////
        System.out.println("Доска №3: 180 градусов");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array [0].length; j++) {
                if ((i + j) % 2 == 0) array [i] [j] = chessBoardCoord3( j, i);
                else array [i] [j] = chessBoardCoord3( j, i);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array [0].length; j++) {
                System.out.print(" " + array [i] [j] + " ");
            }
            System.out.println();
        }
        //////////////////////////////////////////////////////////
        System.out.println("Доска №4: 270 градусов");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array [0].length; j++) {
                if ((i + j) % 2 == 0) array [j] [i] = chessBoardCoord4( j, i);
                else array [j] [i] = chessBoardCoord4( j, i);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array [0].length; j++) {
                System.out.print(" " + array [i] [j] + " ");
            }
            System.out.println();
        }
        }
    }