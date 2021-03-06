package projeto.dawii.lucas.entities;

import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Servidor implements Identificavel {

	@Id
	@GeneratedValue(generator = "servidor_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "servidor_seq")
	private Long id;

	private String nome;
	private Date nascimento;
	private String telefone;
	private String endereco;
	private String cidade;
	private ArrayList<String> servidores;
	private int custoMinimo;

	public Servidor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	
	}

	public int getCustoMinimo() {
		return custoMinimo;
	}

	public void setCustoMinimo(int custoMinimo) {
		this.custoMinimo = custoMinimo;
	}

	public ArrayList<String> getServidores() {
		return servidores;
	}

	public void setServidores(ArrayList<String> servidores) {
		this.servidores = servidores;
	}
}