package com.lastmile.model.abstracts;

/**
 * Created by jan on 19/07/2016.
 */
public abstract class AbstractAnt {

    protected Double health = 100d;

    protected void calculateAntHealth(final Integer percentage) {

        health = getHealthValue();

        if (health >= getDamageValue()) {

            if (percentage >= health) {
                health = 0d;
            } else {
                health = (health - percentage);
            }
        }
    }


    protected Double getHealthValue() {
        return health;
    }

    protected abstract Double getDamageValue();
}
