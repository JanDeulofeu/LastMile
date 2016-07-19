package com.lastmile.model;

/**
 * Created by jan on 19/07/2016.
 */
public interface Ant {

    void damage(Integer damageValue);

    Double getAntStatus();

    boolean isAntDead();
}
