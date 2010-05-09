package gxt.visual.ui.client.interfaces;

import gxt.visual.ui.client.interfaces.presenter.IWindowPresenter;
import gxt.visual.ui.client.interfaces.view.IWindowView;

import com.extjs.gxt.ui.client.widget.Window;

/**
 * @author eugenp
 */
public interface IWindow extends IContentPanel, IWindowView, IWindowPresenter{

	/** mine */
	Window getComponent();

}
