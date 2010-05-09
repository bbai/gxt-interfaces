package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.IScrollContainer;

import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.ScrollContainer;

/**
 * @author eugenp
 */
public class VScrollContainer< T extends Component > extends ScrollContainer< T > implements IScrollContainer< T >{
	
	public VScrollContainer(){
		super();
	}
	
	//
	public ScrollContainer< T > getComponent(){
		return this;
	}
	
}
