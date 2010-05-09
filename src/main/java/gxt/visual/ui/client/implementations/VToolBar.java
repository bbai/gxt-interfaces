package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.IToolBar;

import com.extjs.gxt.ui.client.widget.toolbar.ToolBar;

/**
 * @author eugenp
 */
public class VToolBar extends ToolBar implements IToolBar{
	
	public VToolBar(){
		super();
	}

	//
	public ToolBar getComponent(){
		return this;
	}

}
