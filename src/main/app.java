package main;

import java.util.Calendar;

import beans.Cliente;
import dao.ClienteDao;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClienteDao dao = new ClienteDao();
		
		Cliente cliente = new Cliente();
		cliente.setDataNascimento(Calendar.getInstance());
		cliente.setNome("Sergio");
		
		dao.addCliente(cliente);
		
		System.out.println("Cliente Cadastrado!");
		
	}

}
