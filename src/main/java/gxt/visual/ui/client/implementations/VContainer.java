package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.IContainer;

import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.Container;

/**
 * @author eugenp
 */
public class VContainer< T extends Component > extends Container< T > implements IContainer< T >{
	
	public VContainer(){
		super();
	}
	
	//
	public Container< T > getComponent(){
		return this;
	}
	
}
