

package fabrica_garrafa;


public class Pet implements Ivasilhame {
     private int reuso;

    @Override
    public void encher() {
        reuso++;
        if(reuso==2){//não pode reusar mais
            System.out.println("proibido reusar, reciclando o pet");
            reciclar();
        }
        else{
            System.out.println("pet reusado");
        }
    }

    @Override
    public void reciclar() {
        System.out.println("pet Reciclado!!!");
        reuso = 0;
    }

}
