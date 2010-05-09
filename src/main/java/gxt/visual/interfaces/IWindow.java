package gxt.visual.interfaces;

import gxt.visual.interfaces.presenter.IWindowPresenter;
import gxt.visual.interfaces.view.IWindowView;

import com.extjs.gxt.ui.client.widget.Window;

/**
 * @author eugenp
 */
public interface IWindow extends IContentPanel, IWindowView, IWindowPresenter{

	/** mine */
	Window getComponent();

}
