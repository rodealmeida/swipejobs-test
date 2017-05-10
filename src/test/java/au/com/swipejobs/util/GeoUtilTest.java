package au.com.swipejobs.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * Created by rodealmeida on 9/05/17.
 */
public class GeoUtilTest
{

    @Test
    public void shouldCalculateDistanceLessThan5KMForGivenCoordinates()
    {
        // given
        // Sydney Opera House
        double latFrom = -33.856803;
        double lonFrom = 151.215250;
        // Sydney central train station
        double latTo = -33.882631;
        double lonTo = 151.206581;

        // when
        Double distance = GeoUtil.calculateDistanceBetweenCoordinates(latFrom, latTo, lonFrom, lonTo);

        // then
        assertNotNull(distance);
        assertThat(distance.intValue(), lessThan(5));
    }

    @Test
    public void shouldCalculateDistanceMoreThan5KMForGivenCoordinates()
    {
        // given
        // Sydney Opera House
        double latFrom = -33.856803;
        double lonFrom = 151.215250;
        // Melbourne federation square
        double latTo = -37.817939;
        double lonTo = 144.969042;

        // when
        Double distance = GeoUtil.calculateDistanceBetweenCoordinates(latFrom, latTo, lonFrom, lonTo);

        // then
        assertNotNull(distance);
        assertThat(distance.intValue(), greaterThan(5));
    }
}
