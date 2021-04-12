package Trabalho_Pratico_2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;

public class Arquivo {
	private BufferedReader br;	
	private String arquivo;
	
	public Arquivo(String arquivo){
		this.arquivo = arquivo;
	}
	
	public void gravar(ListaEncadeada bicicletas){
		try{
			PrintStream out = new PrintStream(new File(this.arquivo + ".txt"));
			PrintStream saidaPadrao = System.out;
			System.setOut(out);
			bicicletas.listar();
			System.setOut(saidaPadrao);
			System.out.println("\nGravado com sucesso!\n");
		}catch (Exception e) {
			System.out.println("Erro na abertura de arquivo para gravação.");
		}
	}
	
	public ListaEncadeada ler(){
		ListaEncadeada bicicletas = new ListaEncadeada();
		String id = "";
		String marca = "";
		String tipo = "";
		String valor = "";
		String estado = "";
		try{
			br = new BufferedReader(new FileReader(this.arquivo + ".txt"));
			while((id = br.readLine()) != null){
				marca = br.readLine();
				tipo = br.readLine();
				valor = br.readLine();
				estado = br.readLine();
				id = id.replace("ID: ", "");
				marca = marca.replace("Marca: ", "");
				tipo = tipo.replace("Tipo: ", "");
				valor = valor.replace("Valor: ", "");
				estado = estado.replace("Estado: ", "");
				br.readLine();
				Bicicleta c = new Bicicleta(id, marca, tipo, valor, estado);
				bicicletas.adicionar(c);
			}
			br.close();
		}catch (Exception e) {
			System.out.println("Erro na abertura de arquivo para leitura.");
		}
		return bicicletas;
	}
}
