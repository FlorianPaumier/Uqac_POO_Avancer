package main.Acces;

import java.util.LinkedList;
import java.util.List;

public class Acces {

    private int angleInitial = 0;
    private int angleDifferentiel = 0;
    private List<Integer> gates = new LinkedList<Integer>();

    public Acces(Integer nb) {
        if (nb > 6 || nb < 2)
            return;

        angleDifferentiel = 360 / nb;
        angleInitial = (int)Math.floor(Math.random() * angleDifferentiel);

        for(int i = 0; i < nb; i++)
            gates.add(angleInitial + angleDifferentiel * i);
    }

    public Integer getAngleInitial() { return angleInitial; }

    public Integer getAngleDifferentiel() { return angleDifferentiel; }

    public List<Integer> getGates() {
        return gates;
    }
}