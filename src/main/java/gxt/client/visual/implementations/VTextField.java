package gxt.client.visual.implementations;

import gxt.client.visual.interfaces.ITextField;

import com.extjs.gxt.ui.client.widget.form.TextField;

/**
 * @author eugenp
 */
public class VTextField< D > extends TextField< D > implements ITextField< D >{
	
	public VTextField(){
		super();
	}
	
	//
	public TextField< D > getComponent(){
		return this;
	}
	
}
