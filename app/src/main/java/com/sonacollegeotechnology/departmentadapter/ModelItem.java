package com.sonacollegeotechnology.departmentadapter;

public class ModelItem {

    String deptname, hodname, contactname;

    public ModelItem(String deptname, String hodname, String contactname) {
        this.deptname = deptname;
        this.hodname = hodname;
        this.contactname = contactname;
    }

    public ModelItem(){

    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getHodname() {
        return hodname;
    }

    public void setHodname(String hodname) {
        this.hodname = hodname;
    }

    public String getContactname() {
        return contactname;
    }

    public void setContactname(String contactname) {
        this.contactname = contactname;
    }

}
