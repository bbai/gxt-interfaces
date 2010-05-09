package gxt.visual.ui.implementations;

import gxt.visual.interfaces.IDateField;

import com.extjs.gxt.ui.client.widget.form.DateField;

/**
 * @author eugenp
 */
public class VDateField extends DateField implements IDateField{
	
	public VDateField(){
		super();
	}
	
	//
	public DateField getComponent(){
		return this;
	}
	
}
