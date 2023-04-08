/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package Empleat;

/**
 *
 * @author DeniseGT
 */
public class MaException extends Exception {

    /**
     * Creates a new instance of <code>MaException</code> without detail
     * message.
     */
    public MaException() {
    }

    /**
     * Constructs an instance of <code>MaException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public MaException(String msg) {
        super(msg);
    }
}
