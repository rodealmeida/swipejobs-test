
package au.com.swipejobs.domain;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Created by rodealmeida on 10/05/17.
 */
public class Location
{

    private String longitude;
    private String latitude;

    public String getLongitude()
    {
        return longitude;
    }

    public void setLongitude(String longitude)
    {
        this.longitude = longitude;
    }

    public String getLatitude()
    {
        return latitude;
    }

    public void setLatitude(String latitude)
    {
        this.latitude = latitude;
    }

    @Override
    public int hashCode()
    {
        return new HashCodeBuilder().append(longitude).append(latitude).toHashCode();
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == this) {
            return true;
        }
        if ((other instanceof Location) == false) {
            return false;
        }
        Location rhs = ((Location) other);
        return new EqualsBuilder().append(longitude, rhs.longitude).append(latitude, rhs.latitude).isEquals();
    }

}
