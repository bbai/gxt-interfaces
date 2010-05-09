package gxt.visual.ui.implementations;

import gxt.visual.interfaces.IDatePicker;

import com.extjs.gxt.ui.client.widget.DatePicker;

/**
 * @author eugenp
 */
public class VDatePicker extends DatePicker implements IDatePicker{
	
	public VDatePicker(){
		super();
	}
	
	//
	public DatePicker getComponent(){
		return this;
	}
	
}
