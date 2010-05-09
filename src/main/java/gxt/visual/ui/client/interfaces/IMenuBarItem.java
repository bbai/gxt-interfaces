package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.menu.MenuBarItem;

import gxt.visual.ui.client.interfaces.presenter.IMenuBarItemPresenter;
import gxt.visual.ui.client.interfaces.view.IMenuBarItemView;

/**
 * @author eugenp
 */
public interface IMenuBarItem extends IComponent, IMenuBarItemView, IMenuBarItemPresenter{
	
	/** mine */
	MenuBarItem getComponent();

}
