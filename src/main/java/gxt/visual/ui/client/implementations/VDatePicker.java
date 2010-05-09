package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.IDatePicker;

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
