package gxt.visual.ui.implementations;

import gxt.visual.interfaces.IRadioGroup;

import com.extjs.gxt.ui.client.widget.form.RadioGroup;

/**
 * @author eugenp
 */
public class VRadioGroup extends RadioGroup implements IRadioGroup{
	
	@Override
	public RadioGroup getComponent(){
		return this;
	}
	
}
