
package au.com.swipejobs.domain;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Created by rodealmeida on 10/05/17.
 */
public class Name
{

    private String last;
    private String first;

    public String getLast()
    {
        return last;
    }

    public void setLast(String last)
    {
        this.last = last;
    }

    public String getFirst()
    {
        return first;
    }

    public void setFirst(String first)
    {
        this.first = first;
    }

    @Override
    public int hashCode()
    {
        return new HashCodeBuilder().append(last).append(first).toHashCode();
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == this) {
            return true;
        }
        if ((other instanceof Name) == false) {
            return false;
        }
        Name rhs = ((Name) other);
        return new EqualsBuilder().append(last, rhs.last).append(first, rhs.first).isEquals();
    }

}
