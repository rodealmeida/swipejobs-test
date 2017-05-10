
package au.com.swipejobs.domain;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Created by rodealmeida on 10/05/17.
 */
public class Availability
{

    private String title;
    private Integer dayIndex;

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public Integer getDayIndex()
    {
        return dayIndex;
    }

    public void setDayIndex(Integer dayIndex)
    {
        this.dayIndex = dayIndex;
    }

    @Override
    public int hashCode()
    {
        return new HashCodeBuilder().append(title).append(dayIndex).toHashCode();
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == this) {
            return true;
        }
        if ((other instanceof Availability) == false) {
            return false;
        }
        Availability rhs = ((Availability) other);
        return new EqualsBuilder().append(title, rhs.title).append(dayIndex, rhs.dayIndex).isEquals();
    }

}
