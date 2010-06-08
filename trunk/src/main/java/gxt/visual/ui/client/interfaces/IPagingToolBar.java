package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.toolbar.PagingToolBar;

import gxt.visual.extensions.client.IBindedPagingToolbar;
import gxt.visual.ui.client.interfaces.presenter.IPagingToolBarPresenter;
import gxt.visual.ui.client.interfaces.view.IPagingToolBarView;

/**
 * @author eugenp
 */
public interface IPagingToolBar extends IToolBar, IPagingToolBarView, IPagingToolBarPresenter, IBindedPagingToolbar{
	
	/** mine */
	PagingToolBar getComponent();

}
