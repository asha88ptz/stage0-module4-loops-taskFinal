package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
//                "      *\n"
//                "     **\n"
//                "    ***\n"
//                "   ****\n"
        for (int i = 1; i <= cathetusLength; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(" ".repeat(cathetusLength - i));
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
