public class test {
    public static void main(String[] args) {
        Urna urna = new Urna(100,100);
        while (urna.totalBolas()>1) {
            urna.bola();
            urna.bola();
            System.out.println(" ");
            System.out.println("Blancas= "+urna.blancas);
            System.out.println("Negras= "+urna.negras);
            System.out.println(" ");
            if (urna.totalBolas()==2&&urna.blancas==2) {
                urna.blancas++;
                System.out.println("Se añade una bola blanca");
                System.out.println(" ");
                System.out.println("Blancas= "+urna.blancas);
                System.out.println("Negras= "+urna.negras);
                System.out.println(" ");
            } else if (urna.totalBolas()==2&&urna.negras==2) {
                urna.blancas++;
                System.out.println("Se añade una bola blanca");
                System.out.println(" ");
                System.out.println("Blancas= "+urna.blancas);
                System.out.println("Negras= "+urna.negras);
                System.out.println(" ");
        }else if (urna.totalBolas()==2&&urna.negras==1&&urna.blancas==1){
                urna.negras++;
                System.out.println("Se añade una bola negra");
                System.out.println(" ");
                System.out.println("Blancas= "+urna.blancas);
                System.out.println("Negras= "+urna.negras);
                System.out.println(" ");
            }
        }
        if (urna.totalBolas()==1){
            if (urna.blancas==1){
                System.out.println("La ultima bola es blanca");
                urna.blancas--;
            }else{
                System.out.println("La ultima bola es negra");
                urna.negras--;
            }
        }
    }
}
