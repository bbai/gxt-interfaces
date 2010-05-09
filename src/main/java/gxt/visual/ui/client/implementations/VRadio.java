package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.IRadio;

import com.extjs.gxt.ui.client.widget.form.Radio;

/**
 * @author eugenp
 */
public class VRadio extends Radio implements IRadio{
	
	public VRadio(){
		super();
	}
	
	//
	public Radio getComponent(){
		return this;
	}
	
}
