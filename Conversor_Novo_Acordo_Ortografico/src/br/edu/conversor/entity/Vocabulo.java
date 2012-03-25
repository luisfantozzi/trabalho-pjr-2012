package br.edu.conversor.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name="vocabulo"
    ,catalog="novo_acordo"
)
public class Vocabulo  implements java.io.Serializable {

    private Integer id_vocabulo;
 
	private String nm_vocabulo_antigo;
     
	private String nm_vocabulo_novo;
 
    @Column(name="id_vocabulo", unique=true, nullable=false)
    public Integer getId_vocabulo() {
        return this.id_vocabulo;
    }
    
    @Column(name="nm_vocabulo_antigo", nullable=false, length=50)
    public String getNm_vocabulo_antigo() {
        return this.nm_vocabulo_antigo;
    }
    
    @Column(name="nm_vocabulo_novo", nullable=false, length=50)
    public String getNm_vocabulo_novo() {
        return this.nm_vocabulo_novo;
    }
    
    
    public void setId_vocabulo(int id_vocabulo) {
		this.id_vocabulo = id_vocabulo;
	}


	public void setNm_vocabulo_antigo(String nm_vocabulo_antigo) {
		this.nm_vocabulo_antigo = nm_vocabulo_antigo;
	}


	public void setNm_vocabulo_novo(String nm_vocabulo_novo) {
		this.nm_vocabulo_novo = nm_vocabulo_novo;
	}
    	
}

