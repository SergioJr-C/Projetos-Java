package TrabalhoExercicio2_4;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

// Classe para gravar e ler informações em arquivo de texto
public class Arquivo {
	private BufferedReader br;
	private BufferedWriter bw;
	private String arquivo;
	private String diretorio;
	private String extensao;
	private String caminhoCompleto;
	
	public Arquivo(String arquivo, String extensao){
		this.diretorio ="";
		this.arquivo = arquivo;
		this.extensao = extensao;
		this.caminhoCompleto = "Caminho Completo do Arquivo: " + this.diretorio + this.arquivo + "." + this.extensao;
	}
		
	public void setDiretorio(String diretorio) {
		// Vou supor que o usuário queira um diretório que está dentro de sua home... mas se quiseres, pode mudar isso, e deixar que ele informe todo caminho..
		String dirUser = System.getProperty("user.home");		
		File dir = new File(dirUser+"\\"+diretorio); 
		if (!dir.exists()) { 
			dir.mkdirs(); //Se o caminho que especificou não existe, ele cria o diretório informado dentro da home do usuário 
		}
		this.diretorio = dir.getAbsolutePath() + "\\";
		this.caminhoCompleto = "Caminho Completo do Arquivo: " + this.diretorio + this.arquivo + "." + this.extensao;
	}
	
	public String getCaminhoCompleto() {
		return this.caminhoCompleto;
	}
	
	public void gravar(String texto){
		System.out.println(caminhoCompleto);
		try{
			bw = new BufferedWriter(new FileWriter(this.diretorio + this.arquivo + "." + this.extensao, true));
			bw.write(texto);
			bw.write("\n");
			bw.close();
		}catch (Exception e) {
			System.out.println("Erro na abertura de arquivo para gravação.");
		}
	}
	
	public String ler(){
		String conteudo = "";
		String texto = "";
		try{
			br = new BufferedReader(new FileReader(this.diretorio + this.arquivo + "." + this.extensao));
			while((conteudo = br.readLine()) != null){
				texto = texto + conteudo + "\n";
			}
			br.close();
		}catch (Exception e) {
			System.out.println("Erro na abertura de arquivo para leitura.");
		}
		return texto;
	}
}
