package gxt.visual.interfaces;

import gxt.visual.interfaces.presenter.IPortalPresenter;
import gxt.visual.interfaces.view.IPortalView;

import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.custom.Portal;

/**
 * @author eugenp
 */
public interface IPortal extends IContainer< LayoutContainer >, IPortalView, IPortalPresenter{
	
	/** mine */
	Portal getComponent();

}
