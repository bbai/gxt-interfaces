package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.IMenuBar;

import com.extjs.gxt.ui.client.widget.menu.MenuBar;

/**
 * @author ADaroussin
 */
public class VMenuBar extends MenuBar implements IMenuBar{
	public VMenuBar(){
		super();
	}

	//
	public MenuBar getComponent(){
		return this;
	}
}
