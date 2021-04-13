package TrabalhoExercicio2_5_Resolvido_pelo_Professor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

// Classe para gravar e ler informações em arquivo de texto
public class Arquivo {
	private BufferedReader br;
	private BufferedWriter bw;
	private String arquivo;
	
	public Arquivo(String arquivo){
		this.arquivo = arquivo;
	}
	
	public void gravar(String vetor[]){
		try{			
			// Usei o comando sem o TRUE, para que cada vez que grave o vetor, zere o arquivo!			
			bw = new BufferedWriter(new FileWriter(this.arquivo + ".txt"));
			for(int i=0; i<vetor.length; i++) {
				bw.write(vetor[i]);
				bw.write("\n");
			}
			bw.close();			
			System.out.println("\nGravado com sucesso!\n");
		}catch (Exception e) {
			System.out.println("Erro na abertura de arquivo para gravação.");
		}
	}
	
	public String[] ler(){
		String[] vetUsuarioSenha = new String[2];
		try{
			br = new BufferedReader(new FileReader(this.arquivo + ".txt"));
			vetUsuarioSenha[0] = br.readLine(); // Nome do usuário
			vetUsuarioSenha[1] = br.readLine(); // Senha do usuário			
			br.close();
		}catch (Exception e) {
			System.out.println("Erro na abertura de arquivo para leitura.");
		}				
		return vetUsuarioSenha;
	}
}
