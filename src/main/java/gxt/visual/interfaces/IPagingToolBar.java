package gxt.visual.interfaces;

import com.extjs.gxt.ui.client.widget.toolbar.PagingToolBar;

import gxt.visual.IBindedPagingToolbar;
import gxt.visual.interfaces.presenter.IPagingToolBarPresenter;
import gxt.visual.interfaces.view.IPagingToolBarView;

/**
 * @author eugenp
 */
public interface IPagingToolBar extends IToolBar, IPagingToolBarView, IPagingToolBarPresenter, IBindedPagingToolbar{
	
	/** mine */
	PagingToolBar getComponent();

}
