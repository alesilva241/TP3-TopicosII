/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOClasses;

import java.io.Serializable;

/**
 *
 * @author alexandra
 */
public class Hero implements Serializable{
    
    private int ID;
    private String name;
    private String lore;
    private String side;
    private String url;
    private int carry;
    private int disabler;
    private int lane_support;
    private int initiator;
    private int jungler;
    private int support;
    private int durable;
    private int nuker;
    private int pusher;
    private int escape;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLore() {
        return lore;
    }

    public void setLore(String lore) {
        this.lore = lore;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getCarry() {
        return carry;
    }

    public void setCarry(int carry) {
        this.carry = carry;
    }

    public int getDisabler() {
        return disabler;
    }

    public void setDisabler(int disabler) {
        this.disabler = disabler;
    }

    public int getLane_support() {
        return lane_support;
    }

    public void setLane_support(int lane_support) {
        this.lane_support = lane_support;
    }

    public int getInitiator() {
        return initiator;
    }

    public void setInitiator(int initiator) {
        this.initiator = initiator;
    }

    public int getJungler() {
        return jungler;
    }

    public void setJungler(int jungler) {
        this.jungler = jungler;
    }

    public int getSupport() {
        return support;
    }

    public void setSupport(int support) {
        this.support = support;
    }

    public int getDurable() {
        return durable;
    }

    public void setDurable(int durable) {
        this.durable = durable;
    }

    public int getNuker() {
        return nuker;
    }

    public void setNuker(int nuker) {
        this.nuker = nuker;
    }

    public int getPusher() {
        return pusher;
    }

    public void setPusher(int pusher) {
        this.pusher = pusher;
    }

    public int getEscape() {
        return escape;
    }

    public void setEscape(int escape) {
        this.escape = escape;
    }
@Override
    public String toString() {
        return "Hero{" +
                "id='" + ID+ ''' +
                ", name='" + name+ ''' +
                ", lore='" + lore + ''' +
                ", side='" + side + ''' +
                ", url='" + url + ''' +
                ", carry='" + carry + ''' +
                ", disabler='" + disabler + ''' +
                ", lane_support='" + lane_support + ''' +
                ", jungler='" + jungler + ''' +
                ", support='" + support + ''' +
                ", durable='" + durable + ''' +
                ", nuker='" + nuker + ''' +
                ", nuker='" + pusher + ''' +
                ", escape=" + escape +
            '}';
    }
}