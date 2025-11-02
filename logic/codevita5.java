import java.util.*;

public class codevita5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] cube = new char[24];
        for (int i = 0; i < 24; i++) {
            cube[i] = sc.next().charAt(0);
        }

        // Corner positions: each corner has 3 stickers
        int[][] corners = {
            {0, 4, 16},   // U0 F0 L0
            {1, 5, 20},   // U1 F1 R0
            {2, 13, 17},  // U2 B1 L1
            {3, 12, 21},  // U3 B0 R1
            {8, 6, 18},   // D0 F2 L2
            {9, 7, 22},   // D1 F3 R2
            {10, 15, 19}, // D2 B3 L3
            {11, 14, 23}  // D3 B2 R3
        };

        for (int[] corner : corners) {
            char a = cube[corner[0]];
            char b = cube[corner[1]];
            char c = cube[corner[2]];

            // If all three stickers are different => possible twisted corner
            Set<Character> colors = new HashSet<>();
            colors.add(a);
            colors.add(b);
            colors.add(c);

            if (colors.size() == 3) {
                List<Character> list = new ArrayList<>(colors);
                Collections.sort(list);
                for (char ch : list) System.out.print(ch);
                return; // only one twisted corner
            }
        }
    }
}
