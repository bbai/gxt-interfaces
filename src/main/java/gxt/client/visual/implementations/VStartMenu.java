package gxt.client.visual.implementations;

import gxt.client.visual.interfaces.IStartMenu;

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
