import java.util.*;

public class codevita {

    static int[] segments = new int[]{
        0b1111110, 0b0110000, 0b1101101, 0b1111001, 0b0110011,
        0b1011011, 0b1011111, 0b1110000, 0b1111111, 0b1111011
    };

    static int digitFromSegment(int seg) {
        for (int d = 0; d <= 9; d++) {
            if (segments[d] == seg) return d;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine().trim();
        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);
        int hourCostPerMin = sc.nextInt();
        int minuteCostPerMin = sc.nextInt();

        int[] digits = new int[]{hour / 10, hour % 10, minute / 10, minute % 10};

        int minCost = Integer.MAX_VALUE;
        String closestTime = null;

        for (int pos = 0; pos < 4; pos++) {
            int originalSeg = segments[digits[pos]];
            for (int bit = 0; bit < 7; bit++) {
                int newSeg = originalSeg ^ (1 << bit);
                int newDigit = digitFromSegment(newSeg);
                if (newDigit == -1) continue;

                int[] newDigits = digits.clone();
                newDigits[pos] = newDigit;
                int newHour = newDigits[0] * 10 + newDigits[1];
                int newMinute = newDigits[2] * 10 + newDigits[3];
                if (newHour < 1 || newHour > 12 || newMinute < 0 || newMinute > 59) continue;

                int cost = Math.abs(newHour - hour) * hourCostPerMin * 5
                         + Math.abs(newMinute - minute) * minuteCostPerMin;

                if (cost < minCost || (cost == minCost && (closestTime == null
                        || newHour < Integer.parseInt(closestTime.substring(0,2))
                        || (newHour == Integer.parseInt(closestTime.substring(0,2))
                        && newMinute < Integer.parseInt(closestTime.substring(3)))))) {
                    minCost = cost;
                    closestTime = String.format("%02d:%02d", newHour, newMinute);
                }
            }
        }

        if (closestTime == null)
            System.out.print("No closest valid time possible");
        else
            System.out.print(closestTime);
    }
}
