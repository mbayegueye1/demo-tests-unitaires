package fr.diginamic.immobilier.entites;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaisonTest {

    @Test
    public void testNbPieces(){
        Maison maison = new Maison();
        maison.ajouterPiece(new Chambre(2,20));
        maison.ajouterPiece(new SalleDeBain(2,30));
        assertEquals(0, maison.nbPieces());
        assertEquals(1, maison.nbPieces());
        assertEquals(2, maison.nbPieces());
    }
    @Test
    public void testSuperficieEtage(){
        Maison maison = new Maison();
        maison.ajouterPiece(new Chambre(2,20));
        maison.ajouterPiece(new SalleDeBain(1,30));
        assertEquals(13, maison.superficieEtage(2));
        assertEquals(30, maison.superficieEtage(2));
        assertEquals(20, maison.superficieEtage(2));


    }

}
