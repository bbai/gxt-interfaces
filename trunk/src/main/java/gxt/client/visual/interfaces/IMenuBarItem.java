package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.menu.MenuBarItem;

import gxt.client.visual.interfaces.presenter.IMenuBarItemPresenter;
import gxt.client.visual.interfaces.view.IMenuBarItemView;

/**
 * @author eugenp
 */
public interface IMenuBarItem extends IComponent, IMenuBarItemView, IMenuBarItemPresenter{
	
	/** mine */
	MenuBarItem getComponent();

}
