package com.lastmile.model.impl;

import com.lastmile.model.Ant;
import com.lastmile.model.abstracts.AbstractAnt;
import org.springframework.stereotype.Component;

/**
 * Created by jan on 19/07/2016.
 */
public class Soldier extends AbstractAnt implements Ant {

    private final static Double DAMAGE_VALUE= 66d;

    public Soldier() {
    }

    @Override
    public boolean isAntDead() {

        return super.getHealthValue() < DAMAGE_VALUE ? true : false;
    }

    @Override
    public void damage(final Integer damageValue) {

        super.calculateAntHealth(damageValue);
    }

    @Override
    public Double getAntStatus() {
        return health;
    }


    @Override
    protected Double getDamageValue() {
        return DAMAGE_VALUE;
    }
}
