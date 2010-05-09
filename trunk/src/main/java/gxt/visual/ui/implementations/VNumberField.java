package gxt.visual.ui.implementations;

import gxt.visual.interfaces.INumberField;

import com.extjs.gxt.ui.client.widget.form.NumberField;

/**
 * @author eugenp
 */
public class VNumberField extends NumberField implements INumberField{
	
	@Override
	public NumberField getComponent(){
		return this;
	}
	
}
