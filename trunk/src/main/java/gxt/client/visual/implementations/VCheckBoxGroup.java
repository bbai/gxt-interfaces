package gxt.client.visual.implementations;

import gxt.client.visual.interfaces.ICheckBoxGroup;
import com.extjs.gxt.ui.client.widget.form.CheckBoxGroup;

/**
 * @author eugenp
 */
public class VCheckBoxGroup extends CheckBoxGroup implements ICheckBoxGroup{
	
	public VCheckBoxGroup(){
		super();
	}
	
	//
	@Override
	public CheckBoxGroup getComponent(){
		return this;
	}
	
}
