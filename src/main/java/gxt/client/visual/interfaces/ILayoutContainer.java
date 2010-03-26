package gxt.client.visual.interfaces;

import gxt.client.visual.interfaces.presenter.ILayoutContainerPresenter;
import gxt.client.visual.interfaces.view.ILayoutContainerView;

import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.LayoutContainer;

/**
 * @author eugenp
 */
public interface ILayoutContainer extends IScrollContainer< Component >, ILayoutContainerView, ILayoutContainerPresenter{
	
	/** mine */
	LayoutContainer getComponent();

}
