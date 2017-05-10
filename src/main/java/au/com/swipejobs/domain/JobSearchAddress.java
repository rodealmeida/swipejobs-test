
package au.com.swipejobs.domain;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Created by rodealmeida on 10/05/17.
 */
public class JobSearchAddress
{

    private String unit;
    private Integer maxJobDistance;
    private String longitude;
    private String latitude;

    public String getUnit()
    {
        return unit;
    }

    public void setUnit(String unit)
    {
        this.unit = unit;
    }

    public Integer getMaxJobDistance()
    {
        return maxJobDistance;
    }

    public void setMaxJobDistance(Integer maxJobDistance)
    {
        this.maxJobDistance = maxJobDistance;
    }

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
        return new HashCodeBuilder().append(unit).append(maxJobDistance).append(longitude).append(latitude).toHashCode();
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == this) {
            return true;
        }
        if ((other instanceof JobSearchAddress) == false) {
            return false;
        }
        JobSearchAddress rhs = ((JobSearchAddress) other);
        return new EqualsBuilder().append(unit, rhs.unit)
                .append(maxJobDistance, rhs.maxJobDistance)
                .append(longitude, rhs.longitude)
                .append(latitude, rhs.latitude)
                .isEquals();
    }

}
