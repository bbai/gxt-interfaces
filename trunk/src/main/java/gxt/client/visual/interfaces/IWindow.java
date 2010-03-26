package gxt.client.visual.interfaces;

import gxt.client.visual.interfaces.presenter.IWindowPresenter;
import gxt.client.visual.interfaces.view.IWindowView;

import com.extjs.gxt.ui.client.widget.Window;

/**
 * @author eugenp
 */
public interface IWindow extends IContentPanel, IWindowView, IWindowPresenter{

	/** mine */
	Window getComponent();

}
