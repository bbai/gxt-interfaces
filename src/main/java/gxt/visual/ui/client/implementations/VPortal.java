package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.IPortal;

import com.extjs.gxt.ui.client.widget.custom.Portal;

/**
 * @author eugenp
 */
public class VPortal extends Portal implements IPortal{
	
	public VPortal( final int numColumns ){
		super( numColumns );
	}

	//
	public Portal getComponent(){
		return this;
	}
	
}
