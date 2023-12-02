package fr.diginamic.utils;


import fr.diginamic.enumerations.Saison;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SaisonTest {
    @Test
    public void testValueOfLibelle() {
        Saison resultatAttendu = Saison.PRINTEMPS;
        Saison resultatObtenu = Saison.valueOfLibelle("Printemps");

        assertEquals(resultatAttendu, resultatObtenu);

    }

}


