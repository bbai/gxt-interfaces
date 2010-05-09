package gxt.visual.interfaces;

import com.extjs.gxt.ui.client.widget.menu.MenuBarItem;

import gxt.visual.interfaces.presenter.IMenuBarItemPresenter;
import gxt.visual.interfaces.view.IMenuBarItemView;

/**
 * @author eugenp
 */
public interface IMenuBarItem extends IComponent, IMenuBarItemView, IMenuBarItemPresenter{
	
	/** mine */
	MenuBarItem getComponent();

}
