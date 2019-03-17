package entidades;

import java.util.Date;

import enuns.OrdemPedido;

public class Pedido {
	private Integer id;
	private Date momento;
	private OrdemPedido status;
	
	public Pedido() {
		
	}

	public Pedido(Integer id, Date momento, OrdemPedido status) {
		this.id = id;
		this.momento = momento;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public OrdemPedido getStatus() {
		return status;
	}

	public void setStatus(OrdemPedido status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", momento=" + momento + ", status=" + status + "]";
	}
	
	
	
	
}
