package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.menu.Menu;

import gxt.client.visual.interfaces.presenter.IMenuPresenter;
import gxt.client.visual.interfaces.view.IMenuView;

/**
 * @author eugenp
 */
public interface IMenu extends IContainer< Component >, IMenuView, IMenuPresenter{
	
	/** mine */
	Menu getComponent();

}
