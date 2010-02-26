package gxt.client.visual.implementations;

import gxt.client.visual.interfaces.ITimeField;

import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.form.TimeField;

/**
 * @author eugenp
 */
public class VTimeField extends TimeField implements ITimeField{
	
	public VTimeField(){
		super();
	}
	
	@Override
	public Component getComponent(){
		return this;
	}
	
}
