package br.unicamp.ic.mc437.controller;

import br.unicamp.ic.mc437.model.Mutant;
import br.unicamp.ic.mc437.model.Operator;
import br.unicamp.ic.mc437.util.SessionUtils;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("operator/me/mutant")
@SessionAttributes(SessionUtils.LOGGED_OPERATOR)
public class MutantController {

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Mutant> get(@ModelAttribute(SessionUtils.LOGGED_OPERATOR) Operator loggedOperator) {
		return loggedOperator.findMutants();
	}
}
