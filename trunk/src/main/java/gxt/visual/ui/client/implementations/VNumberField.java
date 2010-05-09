package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.INumberField;

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
