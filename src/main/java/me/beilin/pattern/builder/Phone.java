package me.beilin.pattern.builder;

/**
 * @Author albenyuan
 * @Date 2017-11-16 23:42
 */

public class Phone {

    private String component;

    private Boolean assembled;

    private Boolean osInstalled;

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public Boolean getAssembled() {
        return assembled;
    }

    public void setAssembled(Boolean assembled) {
        this.assembled = assembled;
    }

    public Boolean getOsInstalled() {
        return osInstalled;
    }

    public void setOsInstalled(Boolean osInstalled) {
        this.osInstalled = osInstalled;
    }
}
