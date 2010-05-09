package gxt.visual.interfaces;

import gxt.visual.interfaces.presenter.IToolBarPresenter;
import gxt.visual.interfaces.view.IToolBarView;

import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.toolbar.ToolBar;

/**
 * @author eugenp
 */
public interface IToolBar extends IContainer< Component >, IToolBarView, IToolBarPresenter{
	
	/** mine */
	ToolBar getComponent();

}
