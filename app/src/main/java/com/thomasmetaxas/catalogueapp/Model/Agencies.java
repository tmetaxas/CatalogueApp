package com.thomasmetaxas.catalogueapp.Model;

public class Agencies {

    private static final long id = 1L;

    private String ori;
    private String agency_name;
    private String agency_type_name;
    private String state_name;
    private String division_name;
    private String region_name;
    private String region_description;
    private String county_name;


    public Agencies() {
    }

    public String geOri() {
        return ori;
    }

    public void setOri(String ori) {
        this.ori = ori;
    }

    public String getAgency() {
        return agency_name;
    }

    public void setAgency(String agency_name) {
        this.agency_name = agency_name;
    }

    public String getAgencyType() {
        return agency_type_name;
    }

    public void setAgencyType(String agency_type_name) {
        this.agency_type_name = agency_type_name;
    }

    public String getState() {
        return state_name;
    }

    public void setState(String state_name) {
        this.state_name = state_name;
    }

    public String getDivision() {
        return division_name;
    }

    public void setDivision(String division_name) {
        this.division_name = division_name;
    }

    public String getRegionName() {
        return region_name;
    }

    public void setRegionName(String region_name) {
        this.region_name = region_name;
    }

    public String getRegionDescription() {
        return region_description;
    }

    public void setRegionDescription(String region_description) {
        this.region_description = region_description;
    }

    public String getCounty() {
        return county_name;
    }

    public void setCounty(String county_name) {
        this.county_name = county_name;
    }

}