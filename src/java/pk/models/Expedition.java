package pk.models;
// Generated Mar 18, 2021 3:55:37 PM by Hibernate Tools 4.3.1


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
 * Expedition generated by hbm2java
 */
@Entity
@Table(name="EXPEDITION"
    ,schema="MINE"
)
@SequenceGenerator(name = "seq_exp",sequenceName = "seq_exp")
public class Expedition  implements java.io.Serializable {


     private int idex;
     private Commande commande;
     private String moyenExpedition;
     private String numeroSuivi;
     private String etat;

    public Expedition() {
    }

	
    public Expedition(int idex) {
        this.idex = idex;
    }
    public Expedition(int idex, Commande commande, String moyenExpedition, String numeroSuivi, String etat) {
       this.idex = idex;
       this.commande = commande;
       this.moyenExpedition = moyenExpedition;
       this.numeroSuivi = numeroSuivi;
       this.etat = etat;
    }
   
     @Id 

        @GeneratedValue(generator = "seq_exp",strategy = GenerationType.SEQUENCE)
    @Column(name="IDEX", unique=true, nullable=false, precision=8, scale=0)
    public int getIdex() {
        return this.idex;
    }
    
    public void setIdex(int idex) {
        this.idex = idex;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IDCMD")
    public Commande getCommande() {
        return this.commande;
    }
    
    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    
    @Column(name="MOYEN_EXPEDITION", length=100)
    public String getMoyenExpedition() {
        return this.moyenExpedition;
    }
    
    public void setMoyenExpedition(String moyenExpedition) {
        this.moyenExpedition = moyenExpedition;
    }

    
    @Column(name="NUMERO_SUIVI", length=100)
    public String getNumeroSuivi() {
        return this.numeroSuivi;
    }
    
    public void setNumeroSuivi(String numeroSuivi) {
        this.numeroSuivi = numeroSuivi;
    }

    
    @Column(name="ETAT", length=100)
    public String getEtat() {
        return this.etat;
    }
    
    public void setEtat(String etat) {
        this.etat = etat;
    }




}


