package aplicacao;

import java.util.Date;

import entidades.Pedido;
import enuns.OrdemPedido;

public class Programa {

	public static void main(String[] args) {
		Pedido pedido = new Pedido(1001, new Date(), OrdemPedido.processando);
		
		System.out.println(pedido.toString());
		
		OrdemPedido op1 = OrdemPedido.valueOf("entregue");
		
		System.out.println(op1);
	}

}
