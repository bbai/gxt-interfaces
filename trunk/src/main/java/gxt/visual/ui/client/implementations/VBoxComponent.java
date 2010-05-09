package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.IBoxComponent;

import com.extjs.gxt.ui.client.widget.BoxComponent;

/**
 * @author eugenp
 */
public class VBoxComponent extends BoxComponent implements IBoxComponent{
	
	public VBoxComponent(){
		super();
	}
	
	//
	public BoxComponent getComponent(){
		return this;
	}
	
}
