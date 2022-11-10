/**
 * Created by 21343045_Farraz Hadyan
 */

package Latihan1_Inheritnce;

public class Kedua extends Pertama{
    private int b = 8;
    
    protected void BacaSuper(){
        System.out.println("Nilai b = " + b);
        terprotek();
        info();
    }
}
