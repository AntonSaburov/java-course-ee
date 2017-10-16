package edu.javacourse.ejb.staff;

import javax.ejb.ApplicationException;

/**
 * @author ASaburov
 */
public class BusinessException extends Exception {

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }

}
