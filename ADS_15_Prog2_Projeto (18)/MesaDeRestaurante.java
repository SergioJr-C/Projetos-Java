package TrabalhoExercicio_5_Resolvido_pelo_Professor;
public class MesaDeRestaurante {
	
	// Vou numerar os itens para ent�o usar depois la no adicionaAoPedido()
    private double kgRefeicao; 
    private int sobremesa;      // 0
    private int refrig2L;       // 1
    private int refrig600ml;    // 2
    private int refrigLata;     // 3
    private int cerveja;        // 4

    
    public MesaDeRestaurante() {
    	this.kgRefeicao = 0;
        this.sobremesa = 0;
        this.refrig2L = 0;
        this.refrig600ml = 0;
        this.refrigLata = 0;
        this.cerveja = 0;
    }

    public MesaDeRestaurante(double kgRefeicao, int sobremesa, int refrig2L, int refrig600ml, int refrigLata, int cerveja) {
        this.kgRefeicao = kgRefeicao;
        this.sobremesa = sobremesa;
        this.refrig2L = refrig2L;
        this.refrig600ml = refrig600ml;
        this.refrigLata = refrigLata;
        this.cerveja = cerveja;
    }

    public void setKgRefeicao(double kgRefeicao) {
        this.kgRefeicao = kgRefeicao;
    }

    public double getKgRefeicao() {
        return this.kgRefeicao;
    }

    public int getSobremesa() {
        return sobremesa;
    }

    public void setSobremesa(int sobremesa) {
        this.sobremesa = sobremesa;
    }

    public int getRefrig2L() {
        return refrig2L;
    }

    public void setRefrig2L(int refrig2L) {
        this.refrig2L = refrig2L;
    }

    public int getRefrig600ml() {
        return refrig600ml;
    }

    public void setRefrig600ml(int refrig600ml) {
        this.refrig600ml = refrig600ml;
    }

    public int getRefrigLata() {
        return refrigLata;
    }

    public void setRefrigLata(int refrigLata) {
        this.refrigLata = refrigLata;
    }

    public int getCerveja() {
        return cerveja;
    }

    public void setCerveja(int cerveja) {
        this.cerveja = cerveja;
    }

    /* Aqui tem que dizer o que � para adicionar ao pedido.. mas como � por kg a refei��o, usei m�todo separado.*/
    public void adicionaKgRefeicaoAoPedido(double quantidade) {
    	this.kgRefeicao += quantidade;
    }
    
    /* Aqui tem que dizer o que � para adicionar ao pedido.. qual item... da� temos que passar por par�metro.. */
    public void adicionaAoPedido(int item) {
    	switch (item) {
		case 0:	 
			 this.sobremesa++;      // 0
			 break;
		case 1:	 
			 this.refrig2L++;       // 1
			 break;
		case 2:
			 this.refrig600ml++;    // 2
			 break;
		case 3:	
			 this.refrigLata++;     // 3
			 break;
		case 4:	 
			 this.cerveja++;        // 4
			 break;
		default:
			break;
		}        
    }

    public void zeraPedidos(){
    	this.kgRefeicao = 0;
        this.sobremesa = 0;
        this.refrig2L = 0;
        this.refrig600ml = 0;
        this.refrigLata = 0;
        this.cerveja = 0;
    }
    
    // Aqui s� fa�o uma soma de tudo..
    public double calculaTotal(){
    	// Aqui fa�o a multiplica��o da quantidade de cada item pelo pre�o definido no Restaurante, somo tudo e retorno.
    	return this.cerveja*Restaurante.precoCerveja + 
    			this.kgRefeicao*Restaurante.precokgRefeicao + 
    			this.refrig2L*Restaurante.precoRefrig2L + 
    			this.refrig600ml*Restaurante.precoRefrig600ml + 
    			this.refrigLata*Restaurante.precoRefrigLata + 
    			this.sobremesa*Restaurante.precoSobremesa;
    }
    
    @Override
    public String toString() {
        return "kgRefeicao: " + kgRefeicao
                + "\nSobremesa: " + sobremesa
                + "\nRefrigerante 2L: " + refrig2L
                + "\nRefrigerante 600ml: " + refrig600ml
                + "\nRefrigerante Lata: " + refrigLata
                + "\nCerveja: " + cerveja;
    }

}
