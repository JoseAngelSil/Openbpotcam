public class bucle_While {
    public void bucle_while(){
        int numeroWhile = 0;
        System.out.println("Bucle While \n -------------------------------------------------------------");
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        System.out.println();
    }
    public void do_while(){
        int nu = 0;
        System.out.println("Bucle DO-While \n -------------------------------------------------------------");
        do{
            System.out.println(nu);
            nu++;
        }while (nu < 3);
        System.out.println();
    }
    public void bucle_for(){
        System.out.println("Bucle for \n -------------------------------------------------------------");
        for (int i = 0; i <=3; i++){
            System.out.println(i);
        }
        System.out.println();
    }
}
