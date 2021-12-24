package tn.esprit.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class DetailFacture implements Serializable {
	@Override
	public String toString() {
		return "DetailFacture{" +
				"idDetailFacture=" + idDetailFacture +
				", DateCreation=" + DateCreation +
				", DateDernierModification=" + DateDernierModification +
				", CategorieProduit=" + CategorieProduit +
				", produits=" + produits +
				", facture=" + facture +
				'}';
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idDetailFacture ;
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date DateCreation ;
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date DateDernierModification ;
	@Enumerated(EnumType.ORDINAL)
	private CategorieProduit CategorieProduit;
	@OneToMany(cascade = CascadeType.ALL, mappedBy="detailFacture")
	private Set<Produit> produits;
	@ManyToOne
	Facture facture;

	


}
