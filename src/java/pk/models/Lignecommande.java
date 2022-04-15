package pk.models;
// Generated Mar 18, 2021 3:55:37 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Lignecommande generated by hbm2java
 */
@Entity
@Table(name="LIGNECOMMANDE"
    ,schema="MINE"
)
@SequenceGenerator(name = "seq_lc",sequenceName = "seq_lc")
public class Lignecommande  implements java.io.Serializable {


     private int idlc;
     private Produit produit;
     private Commande commande;
     private Integer qte;
     private float prixAchat;

    public Lignecommande() {
    }

	
    public Lignecommande(int idlc) {
        this.idlc = idlc;
    }
    public Lignecommande(int idlc, Produit produit, Commande commande, Integer qte, float prixAchat) {
       this.idlc = idlc;
       this.produit = produit;
       this.commande = commande;
       this.qte = qte;
       this.prixAchat = prixAchat;
    }
   
     @Id 

    @GeneratedValue(generator = "seq_lc",strategy = GenerationType.SEQUENCE)
    @Column(name="IDLC", unique=true, nullable=false, precision=8, scale=0)
    public int getIdlc() {
        return this.idlc;
    }
    
    public void setIdlc(int idlc) {
        this.idlc = idlc;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IDP")
    public Produit getProduit() {
        return this.produit;
    }
    
    public void setProduit(Produit produit) {
        this.produit = produit;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IDCMD")
    public Commande getCommande() {
        return this.commande;
    }
    
    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    
    @Column(name="QTE", precision=8, scale=0)
    public Integer getQte() {
        return this.qte;
    }
    
    public void setQte(Integer qte) {
        this.qte = qte;
    }

    
    @Column(name="PRIX_ACHAT", precision=10)
    public float getPrixAchat() {
        return this.prixAchat;
    }
    
    public void setPrixAchat(float prixAchat) {
        this.prixAchat = prixAchat;
    }




}


