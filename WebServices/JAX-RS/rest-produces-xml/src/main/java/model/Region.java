package model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Author: ASaburov
 * Date: 15.07.13
 */
@XmlRootElement(name = "region")
public class Region {

    private Integer regionId;
    private String regionName;
    private Integer population;

    public Region() {
    }

    public Region(Integer regionId, String regionName, Integer population) {
        this.regionId = regionId;
        this.regionName = regionName;
        this.population = population;
    }

    @XmlAttribute
    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }
}
