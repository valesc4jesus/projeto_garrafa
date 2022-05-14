

package fabrica_garrafa;


public class Fabrica {
     public Ivasilhame criaVasilha(float capacidade){
        if(capacidade==2){
            return new Pet();
        }
        if(capacidade == 20){
            return new Garrafao();
        }
        if(capacidade == 0.5){
            return new Vidro();
        }
        return null;
    }

}
