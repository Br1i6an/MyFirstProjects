/*
 * Author     Brian Rodriguez
 * Date       October 23 2019
 * Directory  Admin age of persons using arrays
 */
package p2t17_tunja_democracy;

public class P2T17_Tunja_democracy {

    public static void main(String[] args) {
        double[] candidates= Votaciones();
        Show_results(candidates);
        Resultados(candidates);
    }
    public static double []Votaciones() {
        try {
            double [] Votes =new double[8];
            for(int i=0;i<8;i++){
                Votes[i]=Math.round(Math.random()*31000);
            
        }
            return Votes;
            
        } catch (Exception e) {
            System.err.println("Aborted system: "+e.toString());
            return null;
        }
        
    }
    public static void Resultados(double[] Votaciones) {
        try {
            int winner=0;
            double votes=0;
            for(int i=0;i<6;i++){
                if(i==0){
                    votes=Votaciones[i];
                    winner=i;
                    
                }else if(Votaciones[i]>votes){
                    votes=Votaciones[i];
                    winner=1;
                    
                }
                
            }
            System.out.println("The winner is "+(winner+1)+" with "+votes);
            
        } catch (Exception e) {
            System.err.println("Aborted system: "+e.toString());
        }
        
    }
    public static void Show_results(double[] Votaciones) {
        try {
            for(int i=0;i<8;i++)
                System.out.println("Cantidate "+ (i+1)+" with "+Votaciones[i]);
            
        } catch (Exception e) {
            System.err.println("Aborted system: "+e.toString());
        }
        
    }

}
