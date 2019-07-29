package Colecciones;
import java.util.*;


public class CuentasUsuarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cl1 = new Cliente("Toni","0001",200000);
		Cliente cl2 = new Cliente("Rami","0002",250000);
		Cliente cl3 = new Cliente("Tani","0003",300000);
		Cliente cl4 = new Cliente("Ruth","0004",500000);
		Cliente cl5 = new Cliente("Toni","0001",200000);

		Set <Cliente> clientesBanco = new HashSet<Cliente>();
		
		clientesBanco.add(cl1);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);
		clientesBanco.add(cl5);
		
		for (Cliente cliente : clientesBanco) {
			
			/*System.out.println(cliente.getNombre() + " " + 
			cliente.getN_cuenta() + " " + cliente.getSaldo());*/
			
			if (cliente.getNombre().equals("Rami")) {
				
				clientesBanco.remove(cliente);
				
			}
			
		}
		
		for (Cliente cliente : clientesBanco) {
			
			System.out.println(cliente.getNombre() + " " + 
					cliente.getN_cuenta() + " " + cliente.getSaldo());
			
		}
		
		/*Iterator<Cliente> it = clientesBanco.iterator();
		while(it.hasNext()) {
		
			String nombre_cliente = it.next().getNombre();
			
			System.out.println(nombre_cliente);
		}*/
		
	}

}
