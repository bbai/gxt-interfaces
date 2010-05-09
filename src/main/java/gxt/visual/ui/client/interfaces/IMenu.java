package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.menu.Menu;

import gxt.visual.ui.client.interfaces.presenter.IMenuPresenter;
import gxt.visual.ui.client.interfaces.view.IMenuView;

/**
 * @author eugenp
 */
public interface IMenu extends IContainer< Component >, IMenuView, IMenuPresenter{
	
	/** mine */
	Menu getComponent();

}
