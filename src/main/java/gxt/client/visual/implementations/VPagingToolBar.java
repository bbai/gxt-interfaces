package gxt.client.visual.implementations;

import gxt.client.visual.interfaces.IPagingToolBar;

import com.extjs.gxt.ui.client.widget.toolbar.PagingToolBar;

/**
 * @author eugenp
 */
public class VPagingToolBar extends PagingToolBar implements IPagingToolBar{
	
	public VPagingToolBar( final int pageSizeToUse ){
		super( pageSizeToUse );
	}

	//
	@Override
	public VPagingToolBar getComponent(){
		return this;
	}

}
