package gxt.client.visual.desktop.client.implementations;

import gxt.client.visual.desktop.client.interfaces.IStartMenu;

import com.extjs.gxt.desktop.client.StartMenu;

/**
 * @author eugenp
 */
public class VStartMenu extends StartMenu implements IStartMenu{
	
	public VStartMenu(){
		super();
	}
	
	//
	public StartMenu getComponent(){
		return this;
	}
	
}
