package br.unicamp.ic.mc437.util;

import br.unicamp.ic.mc437.model.Operator;

import javax.servlet.http.HttpSession;

public class SessionUtils {

	public static final String LOGGED_OPERATOR = "loggedOperator";

    //Métodos de Login de Operator
	public static void putLoggedOperator(Operator loggedOperator, HttpSession session) {
		session.setAttribute(LOGGED_OPERATOR, loggedOperator);
	}

	public static Operator getLoggedOperator(HttpSession httpSession) {
		return (Operator) httpSession.getAttribute(LOGGED_OPERATOR);
	}

    public static void removeLoggedOperator(HttpSession httpSession) {
        httpSession.removeAttribute(LOGGED_OPERATOR);
    }

}
