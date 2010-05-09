package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.IStatus;

import com.extjs.gxt.ui.client.widget.Status;

/**
 * @author eugenp
 */
public class VStatus extends Status implements IStatus{
	
	public VStatus(){
		super();
	}
	
	//
	public Status getComponent(){
		return this;
	}
	
}
