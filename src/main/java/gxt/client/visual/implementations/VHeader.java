package gxt.client.visual.implementations;

import gxt.client.visual.interfaces.IHeader;

import com.extjs.gxt.ui.client.widget.Header;

/**
 * @author eugenp
 */
public class VHeader extends Header implements IHeader{
	
	public VHeader(){
		super();
	}
	
	//
	public Header getComponent(){
		return this;
	}
	
}
