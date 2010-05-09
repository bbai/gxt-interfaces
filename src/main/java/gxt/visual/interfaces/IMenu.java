package gxt.visual.interfaces;

import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.menu.Menu;

import gxt.visual.interfaces.presenter.IMenuPresenter;
import gxt.visual.interfaces.view.IMenuView;

/**
 * @author eugenp
 */
public interface IMenu extends IContainer< Component >, IMenuView, IMenuPresenter{
	
	/** mine */
	Menu getComponent();

}
