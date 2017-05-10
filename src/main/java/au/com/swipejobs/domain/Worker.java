
package au.com.swipejobs.domain;

import java.util.ArrayList;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Created by rodealmeida on 10/05/17.
 */
public class Worker
{

    private Integer rating;
    private Boolean isActive;
    private ArrayList<String> certificates = null;
    private ArrayList<String> skills = null;
    private JobSearchAddress jobSearchAddress;
    private String transportation;
    private Boolean hasDriversLicense;
    private ArrayList<Availability> availability = null;
    private String phone;
    private String email;
    private Name name;
    private Integer age;
    private String guid;
    private Integer userId;

    public Integer getRating()
    {
        return rating;
    }

    public void setRating(Integer rating)
    {
        this.rating = rating;
    }

    public Boolean getIsActive()
    {
        return isActive;
    }

    public void setIsActive(Boolean isActive)
    {
        this.isActive = isActive;
    }

    public ArrayList<String> getCertificates()
    {
        return certificates;
    }

    public void setCertificates(ArrayList<String> certificates)
    {
        this.certificates = certificates;
    }

    public ArrayList<String> getSkills()
    {
        return skills;
    }

    public void setSkills(ArrayList<String> skills)
    {
        this.skills = skills;
    }

    public JobSearchAddress getJobSearchAddress()
    {
        return jobSearchAddress;
    }

    public void setJobSearchAddress(JobSearchAddress jobSearchAddress)
    {
        this.jobSearchAddress = jobSearchAddress;
    }

    public String getTransportation()
    {
        return transportation;
    }

    public void setTransportation(String transportation)
    {
        this.transportation = transportation;
    }

    public Boolean getHasDriversLicense()
    {
        return hasDriversLicense;
    }

    public void setHasDriversLicense(Boolean hasDriversLicense)
    {
        this.hasDriversLicense = hasDriversLicense;
    }

    public ArrayList<Availability> getAvailability()
    {
        return availability;
    }

    public void setAvailability(ArrayList<Availability> availability)
    {
        this.availability = availability;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public Name getName()
    {
        return name;
    }

    public void setName(Name name)
    {
        this.name = name;
    }

    public Integer getAge()
    {
        return age;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }

    public String getGuid()
    {
        return guid;
    }

    public void setGuid(String guid)
    {
        this.guid = guid;
    }

    public Integer getUserId()
    {
        return userId;
    }

    public void setUserId(Integer userId)
    {
        this.userId = userId;
    }

    @Override
    public int hashCode()
    {
        return new HashCodeBuilder().append(rating)
                .append(isActive)
                .append(certificates)
                .append(skills)
                .append(jobSearchAddress)
                .append(transportation)
                .append(hasDriversLicense)
                .append(availability)
                .append(phone)
                .append(email)
                .append(name)
                .append(age)
                .append(guid)
                .append(userId)
                .toHashCode();
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == this) {
            return true;
        }
        if ((other instanceof Worker) == false) {
            return false;
        }
        Worker rhs = ((Worker) other);
        return new EqualsBuilder().append(rating, rhs.rating)
                .append(isActive, rhs.isActive)
                .append(certificates, rhs.certificates)
                .append(skills, rhs.skills)
                .append(jobSearchAddress, rhs.jobSearchAddress)
                .append(transportation, rhs.transportation)
                .append(hasDriversLicense, rhs.hasDriversLicense)
                .append(availability, rhs.availability)
                .append(phone, rhs.phone)
                .append(email, rhs.email)
                .append(name, rhs.name)
                .append(age, rhs.age)
                .append(guid, rhs.guid)
                .append(userId, rhs.userId)
                .isEquals();
    }

}
