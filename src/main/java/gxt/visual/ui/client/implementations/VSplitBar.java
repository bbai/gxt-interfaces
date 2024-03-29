package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.ISplitBar;

import com.extjs.gxt.ui.client.Style.LayoutRegion;
import com.extjs.gxt.ui.client.widget.BoxComponent;
import com.extjs.gxt.ui.client.widget.SplitBar;

/**
 * @author eugenp
 */
public class VSplitBar extends SplitBar implements ISplitBar{
	
	public VSplitBar( final LayoutRegion style, final BoxComponent resizeWidget ){
		super( style, resizeWidget );
	}
	public VSplitBar( final LayoutRegion style, final BoxComponent resizeWidget, final BoxComponent container ){
		super( style, resizeWidget, container );
	}

	//
	public SplitBar getComponent(){
		return this;
	}
	
}
