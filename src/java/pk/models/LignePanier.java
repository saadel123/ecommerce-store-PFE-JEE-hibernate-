/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.models;

/**
 *
 * @author Abdelmojib chrara
 */
public class LignePanier {
    private Produit produit;
    private int qte;

    public LignePanier(Produit produit, int qte) {
       this.produit = produit;
       this.qte = qte;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public Produit getProduit() {
        return produit;
    }

    public int getQte() {
        return qte;
    }
}
