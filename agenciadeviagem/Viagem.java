package agenciadeviagem;

public class Viagem {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();    
		cliente1.setNome("Delucca");
		cliente1.setCpf("111.236.456-91");
		cliente1.setRg("22.555.888-4");
		cliente1.setTelefone("(21)95648-5845");
		cliente1.setDataIda("15/11/2021");
		cliente1.setDataVolta("21/11/2021");
		
		System.out.println("Seu nome é " + cliente1.getNome());
		System.out.println("Seu CPF é "+ cliente1.getCpf());
		System.out.println("Seu RG é "+ cliente1.getRg());
		System.out.println("Telefone do cliente é " + cliente1.getTelefone());
		System.out.println("A data de ida foi " + cliente1.getDataIda());
		System.out.println("A data de volta foi " + cliente1.getDataVolta());
		
		Destino destino1 = new Destino();
		destino1.setCidade("Natal");
		destino1.setEstado("Rio Grande do Norte");
		destino1.setPais("Brasil");
		destino1.setValor(4000.00);
		destino1.setTaxa(20.00);
		
		System.out.println("A cidade aonde nós iremos passar as ferias será " + destino1.getCidade());
		System.out.println(destino1.getEstado() + " é uma cidade muito bonita!");
		System.out.println(destino1.getPais() + " terra boa!");
		System.out.println("O valor da viagem foi " + destino1.getValor());	
		System.out.println("A taxa da hospedagem corresponde a " + destino1.getTaxa());	
		System.out.println("o valor da taxa de " + destino1.getTaxa() + " + valor da viagem de " + destino1.getValor() + " = " + (destino1.getTaxa() + destino1.getValor()));
				
	}
	
}