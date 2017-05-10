package au.com.swipejobs.util;

/**
 * Created by rodealmeida on 9/05/17.
 */
public class GeoUtil
{
    private GeoUtil()
    {
    }

    /**
     * Calculate distance between two points in latitude and longitude.
     * Uses Haversine method as its base.
     *
     * @param lat1
     * @param lat2
     * @param lon1
     * @param lon2
     *
     * @returns Distance in KM
     */
    public static double calculateDistanceBetweenCoordinates(double lat1, double lat2, double lon1, double lon2)
    {
        final int R = 6371; // Radius of the earth

        double latDistance = Math.toRadians(lat2 - lat1);
        double lonDistance = Math.toRadians(lon2 - lon1);
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c * 1000; // convert to meters

        // height is ignored
        double height = 0;

        distance = Math.pow(distance, 2) + Math.pow(height, 2);

        return Math.sqrt(distance) / 1000;
    }
}
