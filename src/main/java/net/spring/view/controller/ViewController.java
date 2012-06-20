package net.spring.view.controller;

import javax.inject.Inject;
import javax.inject.Named;

import net.spring.view.propertyeditor.UserPropertyEditor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/view")
public class ViewController {
	
	@Inject
	@Named("checkBoxesBean")
	private CheckBoxesBean checkBoxesBean;
	
	@RequestMapping("checkbox")
	
	public String populateCheckBoxes(Model model){
		//model.addAttribute("checkBoxesBean", new CheckBoxesBean());
		model.addAttribute("checkBoxesBean", checkBoxesBean);
		return "view/checkboxes";
	}
	
	@RequestMapping("checkboxsubmit")
	public void handleCheckBoxes( @ModelAttribute("checkBoxesBean") CheckBoxesBean model){
		model.getClass();
	}

	//Register custom property editor for this controller.
	@InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(net.spring.view.controller.User.class, new UserPropertyEditor());
    }
}
