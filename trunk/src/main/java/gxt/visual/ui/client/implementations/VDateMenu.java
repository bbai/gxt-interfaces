package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.IDateMenu;

import com.extjs.gxt.ui.client.widget.menu.DateMenu;

/**
 * @author eugenp
 */
public abstract class VDateMenu extends DateMenu implements IDateMenu{

	public VDateMenu(){
		super();
	}

	//
	public DateMenu getComponent(){
		return this;
	}

}
