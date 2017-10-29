/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ServerRMI;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author apple
 */
public class Services extends UnicastRemoteObject implements OperationRMI{

    protected Services () throws RemoteException {
        super();
    }
    private static final long serialVersionUID = 1L;
    
    @Override
    public float implementsCal(float var1, String operasi, float var2) {
       float result = 0;
       switch(operasi){
           case "+":
               result = var1 + var2;
               break;
           case "-" :
               result = var1 - var2;
               break;
           case "*" :
               result = var1 * var2;
               break;
           case "/" :
               result = var1 / var2;
               break;
       }
               
        return result;
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
