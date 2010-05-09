package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.IShortcut;

import com.extjs.gxt.desktop.client.Shortcut;

/**
 * @author eugenp
 */
public class VShortcut extends Shortcut implements IShortcut{
	
	public VShortcut(){
		super();
	}
	
	//
	public Shortcut getComponent(){
		return this;
	}
	
}
