public class oopspattern {

    // Method to generate pattern for 'O'
    public static String[] getOPattern() {
        return new String[]{
                " *** ",
                "** **",
                "** **",
                "** **",
                "** **",
                "** **",
                " *** "
        };
    }

    // Method to generate pattern for 'P'
    public static String[] getPPattern() {
        return new String[]{
                "**** ",
                "** **",
                "** **",
                "**** ",
                "**   ",
                "**   ",
                "**   "
        };
    }

    // Method to generate pattern for 'S'
    public static String[] getSPattern() {
        return new String[]{
                " ****",
                "**   ",
                "**   ",
                " *** ",
                "    **",
                "    **",
                "**** "
        };
    }

    // Main method
    public static void main(String[] args) {

        // Get patterns
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Print OOPS banner
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(oPattern[i] + "  "
                    + oPattern[i] + "  "
                    + pPattern[i] + "  "
                    + sPattern[i]);
        }
    }
}