

package fabrica_garrafa;


public class Fabrica_Garrafa {

 
    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();
        
        Ivasilhame cerveja;
        Ivasilhame refri;
        Ivasilhame fresca;
        fresca = fabrica.criaVasilha(20);
        cerveja = fabrica.criaVasilha(0.5f);
        refri = fabrica.criaVasilha(2);
        fresca.encher();
        fresca.encher();
        fresca.encher();
        fresca.encher();
        cerveja.encher();
        cerveja.encher();
        cerveja.encher();
        cerveja.encher();
        refri.encher();
        refri.encher();
        refri.encher();
        refri.encher();
    
       
    }

}
