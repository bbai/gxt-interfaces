package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.toolbar.PagingToolBar;
import gxt.client.visual.IBindedPagingToolbar;
import gxt.client.visual.interfaces.presenter.IPagingToolBarPresenter;
import gxt.client.visual.interfaces.view.IPagingToolBarView;

/**
 * @author eugenp
 */
public interface IPagingToolBar extends IToolBar, IPagingToolBarView, IPagingToolBarPresenter, IBindedPagingToolbar{
	
	/** mine */
	PagingToolBar getComponent();

}
