package gxt.visual.ui.implementations;

import gxt.visual.interfaces.IComponent;

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
