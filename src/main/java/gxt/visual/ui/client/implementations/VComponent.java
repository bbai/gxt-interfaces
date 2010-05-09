package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.IComponent;

import com.extjs.gxt.ui.client.widget.Component;

/**
 * @author eugenp
 */
public class VComponent extends Component implements IComponent{
	
	public VComponent(){
		super();
	}
	
	//
	public Component getComponent(){
		return this;
	}

}
