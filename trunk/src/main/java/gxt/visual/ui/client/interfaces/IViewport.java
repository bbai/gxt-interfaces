package gxt.visual.ui.client.interfaces;

import gxt.visual.ui.client.interfaces.presenter.IViewportPresenter;
import gxt.visual.ui.client.interfaces.view.IViewportView;

import com.extjs.gxt.ui.client.widget.Viewport;

/**
 * @author ADaroussin
 */
public interface IViewport extends ILayoutContainer, IViewportView, IViewportPresenter{

	/** mine */
	Viewport getComponent();
}
