package gxt.client.visual.implementations;

import gxt.client.visual.interfaces.INumberField;

import com.extjs.gxt.ui.client.widget.form.NumberField;

public class VNumberField extends NumberField implements INumberField{
	
	@Override
	public NumberField getComponent(){
		return this;
	}
	
}
