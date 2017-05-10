
package au.com.swipejobs.domain;

import java.util.ArrayList;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Created by rodealmeida on 10/05/17.
 */
public class Job
{

    private Boolean driverLicenseRequired;
    private ArrayList<String> requiredCertificates = null;
    private Location location;
    private String billRate;
    private Integer workersRequired;
    private String startDate;
    private String about;
    private String jobTitle;
    private String company;
    private String guid;
    private Integer jobId;

    public Boolean getDriverLicenseRequired()
    {
        return driverLicenseRequired;
    }

    public void setDriverLicenseRequired(Boolean driverLicenseRequired)
    {
        this.driverLicenseRequired = driverLicenseRequired;
    }

    public ArrayList<String> getRequiredCertificates()
    {
        return requiredCertificates;
    }

    public void setRequiredCertificates(ArrayList<String> requiredCertificates)
    {
        this.requiredCertificates = requiredCertificates;
    }

    public Location getLocation()
    {
        return location;
    }

    public void setLocation(Location location)
    {
        this.location = location;
    }

    public String getBillRate()
    {
        return billRate;
    }

    public void setBillRate(String billRate)
    {
        this.billRate = billRate;
    }

    public Integer getWorkersRequired()
    {
        return workersRequired;
    }

    public void setWorkersRequired(Integer workersRequired)
    {
        this.workersRequired = workersRequired;
    }

    public String getStartDate()
    {
        return startDate;
    }

    public void setStartDate(String startDate)
    {
        this.startDate = startDate;
    }

    public String getAbout()
    {
        return about;
    }

    public void setAbout(String about)
    {
        this.about = about;
    }

    public String getJobTitle()
    {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle)
    {
        this.jobTitle = jobTitle;
    }

    public String getCompany()
    {
        return company;
    }

    public void setCompany(String company)
    {
        this.company = company;
    }

    public String getGuid()
    {
        return guid;
    }

    public void setGuid(String guid)
    {
        this.guid = guid;
    }

    public Integer getJobId()
    {
        return jobId;
    }

    public void setJobId(Integer jobId)
    {
        this.jobId = jobId;
    }

    @Override
    public int hashCode()
    {
        return new HashCodeBuilder().append(driverLicenseRequired)
                .append(requiredCertificates)
                .append(location)
                .append(billRate)
                .append(workersRequired)
                .append(startDate)
                .append(about)
                .append(jobTitle)
                .append(company)
                .append(guid)
                .append(jobId)
                .toHashCode();
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == this) {
            return true;
        }
        if ((other instanceof Job) == false) {
            return false;
        }
        Job rhs = ((Job) other);
        return new EqualsBuilder().append(driverLicenseRequired, rhs.driverLicenseRequired)
                .append(requiredCertificates, rhs.requiredCertificates)
                .append(location, rhs.location)
                .append(billRate, rhs.billRate)
                .append(workersRequired, rhs.workersRequired)
                .append(startDate, rhs.startDate)
                .append(about, rhs.about)
                .append(jobTitle, rhs.jobTitle)
                .append(company, rhs.company)
                .append(guid, rhs.guid)
                .append(jobId, rhs.jobId)
                .isEquals();
    }

}
