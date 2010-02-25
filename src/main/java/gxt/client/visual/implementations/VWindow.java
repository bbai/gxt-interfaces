package gxt.client.visual.implementations;

import gxt.client.visual.interfaces.IWindow;

import com.extjs.gxt.ui.client.widget.Window;

/**
 * @author eugenp
 */
public class VWindow extends Window implements IWindow{
	
	public VWindow(){
		super();
	}
	
	//
	public Window getComponent(){
		return this;
	}
	
}
