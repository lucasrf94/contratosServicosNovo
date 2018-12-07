package projeto.dawii.lucas.entities;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class ServicoPrest implements Identificavel {

	@Id
	@GeneratedValue(generator = "ServicoPrest_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "ServicoPrest_seq")
	private Long id_serv;

	String trabalho[] = { "psicologo", "baba", "eletricista", "vendedor", "pedreiro", "professor" };

	public ServicoPrest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId_serv() {
		return id_serv;
	}

	public void setId_serv(Long id_serv) {
		this.id_serv = id_serv;
	}

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub

	}
}
