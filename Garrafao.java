

package fabrica_garrafa;


public class Garrafao implements Ivasilhame {
    private int reuso = 0;

    @Override
    public void encher() {
        reuso++;
        if(reuso==2){//não pode reusar mais
            System.out.println("proibido reusar, reciclando o garrafão");
            reciclar();
        }
        else{
            System.out.println("Garrafão reusado");
        }
    }

    @Override
    public void reciclar() {
        System.out.println("Garrafão Reciclado!!!");
        reuso = 0;
    }
    

}
