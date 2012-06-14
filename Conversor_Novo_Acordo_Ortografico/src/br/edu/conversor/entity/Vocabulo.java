package br.edu.conversor.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="vocabulos"
    ,catalog="novo_acordo"
)
public class Vocabulo  implements java.io.Serializable {

    private Integer id;
 
	private String vocabuloAntigo;
     
	private String vocabuloNovo;
	
	@Id @GeneratedValue(strategy=IDENTITY)
    @Column(name="id_vocabulo", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    @Column(name="nm_vocabulo_antigo", nullable=false, length=50)
    public String getVocabuloAntigo() {
        return this.vocabuloAntigo;
    }
    
    @Column(name="nm_vocabulo_novo", nullable=false, length=50)
    public String getVocabuloNovo() {
        return this.vocabuloNovo;
    }
    
    
    public void setId(int id) {
		this.id = id;
	}


	public void setVocabuloAntigo(String vocabuloAntigo) {
		this.vocabuloAntigo = vocabuloAntigo;
	}


	public void setVocabuloNovo(String vocabuloNovo) {
		this.vocabuloNovo = vocabuloNovo;
	}
    	
}

