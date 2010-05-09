package gxt.visual.ui.implementations;

import gxt.visual.interfaces.IBoxComponent;

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
