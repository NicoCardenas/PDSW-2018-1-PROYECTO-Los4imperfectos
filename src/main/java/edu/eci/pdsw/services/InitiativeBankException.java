package edu.eci.pdsw.services;

public class InitiativeBankException extends Exception {

   
    public InitiativeBankException() {
    }

    /**
     * @param msg the detail message.
     */
    public InitiativeBankException(String msg) {
        super(msg);
    }
    
    public InitiativeBankException(String msg, Throwable err){
        super(msg, err);
    }
    
    public InitiativeBankException(Throwable err) {
        super(err);
    }
}
