

package fabrica_garrafa;


public class Vidro implements Ivasilhame {
    int reuso = 0;

    @Override
    public void encher() {
        reuso++;
        if(reuso==3){//não pode reusar mais
            System.out.println("proibido reusar, reciclando o vidro");
            reciclar();
        }
        else{
            System.out.println("vidro reusado");
        }
    }

    @Override
    public void reciclar() {
        
        System.out.println("vidro Reciclado!!!");
        reuso = 0;
    }

}
