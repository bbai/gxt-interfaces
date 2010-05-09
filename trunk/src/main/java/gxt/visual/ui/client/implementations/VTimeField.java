package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.ITimeField;

import com.extjs.gxt.ui.client.widget.form.TimeField;

/**
 * @author eugenp
 */
public class VTimeField extends TimeField implements ITimeField{
	
	public VTimeField(){
		super();
	}
	
	//
	@Override
	public TimeField getComponent(){
		return this;
	}
	
}
