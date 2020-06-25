
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * june 24th
 * @author pawankang
 */
public class StausUser 
{

   
    public enum status {ZERO,ONE,TWO,THREE};
    status a = status.ZERO;
    status b = status.ONE;
    status c = status.TWO;
    status d = status.THREE;

   public void statusDetail(int code)
{
    if (code == a.ordinal()){
        System.out.println("REJECTED");
    }
    else if (code == b.ordinal()){
        System.out.println("PENDING");
    }
    else if (code == c.ordinal()){
        System.out.println("PROCESSING");
    }
    
    else if (code == d.ordinal()){
        System.out.println("APPROVED");
    }
    else{
        System.out.println("NOT A VALID CODE");
    }

}
 
}