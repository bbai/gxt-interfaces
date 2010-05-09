package gxt.visual.ui.implementations;

import gxt.visual.interfaces.IColorMenu;

import com.extjs.gxt.ui.client.widget.menu.ColorMenu;

/**
 * @author eugenp
 */
public class VColorMenu extends ColorMenu implements IColorMenu{
	
	public VColorMenu(){
		super();
	}
	
	//
	@Override
	public ColorMenu getComponent(){
		return this;
	}
	
}
