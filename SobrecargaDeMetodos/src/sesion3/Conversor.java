
package sesion3;

public class Conversor {

    public void conversion (double gradosC){
        double gradosF  = ((gradosC * 9)/5)+32;
        System.out.println(gradosC + " C° es igual a " + gradosF + " F°");
    }
    
    
    public void conversion (float km){
        float millas = (Math.round((km*0.621371)*100))/100f ;
        System.out.println(km + " kilometros es igual a " + millas + " millas.");
    }

    public void conversion (int totalSeg){
        int min = totalSeg/60;
        int seg = totalSeg%60;
        
        System.out.println(totalSeg + " segundos son: " + min + " minutos y " + seg + " segundos.");
    }
    
}

