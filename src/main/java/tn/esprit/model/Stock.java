package tn.esprit.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity 
public class Stock implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idStock;
	private int qte;
	private int qtemin ;

	@Override
	public String toString() {
		return "Stock{" +
				"idStock=" + idStock +
				", qte=" + qte +
				", qtemin=" + qtemin +
				", libellStock='" + libellStock + '\'' +
				", produits=" + produits +
				'}';
	}

	private String libellStock ;
	@OneToMany(cascade = CascadeType.ALL, mappedBy="stock")
	private Set<Produit> produits;
	
	

	
}
