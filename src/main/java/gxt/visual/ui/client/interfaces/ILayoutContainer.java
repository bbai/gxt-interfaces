package gxt.visual.ui.client.interfaces;

import gxt.visual.ui.client.interfaces.presenter.ILayoutContainerPresenter;
import gxt.visual.ui.client.interfaces.view.ILayoutContainerView;

import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.LayoutContainer;

/**
 * @author eugenp
 */
public interface ILayoutContainer extends IScrollContainer< Component >, ILayoutContainerView, ILayoutContainerPresenter{
	
	/** mine */
	LayoutContainer getComponent();

}
