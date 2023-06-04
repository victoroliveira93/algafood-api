package com.algaworks.algafood.di.service;

import com.algaworks.algafood.di.modelo.Cliente;

public class ClienteAtivadoEvent {
	
	private Cliente cliente;
	
	 ClienteAtivadoEvent(Cliente cliente) {
		 super();
		 this.cliente = cliente;
	 }
	 
	 public Cliente getCliente() {
		 return cliente;
	 }

}
