public class Task3 {

    public static int largestAltitude(int[] gain) {
        int altitude = 0;
        int maxAltitude = 0;

        for (int g : gain) {
            altitude += g;
            if (altitude > maxAltitude) {
                maxAltitude = altitude;
            }
        }

        return maxAltitude;
    }

    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};

        int result = largestAltitude(gain);

        System.out.println("Highest Altitude: " + result);
    }
}