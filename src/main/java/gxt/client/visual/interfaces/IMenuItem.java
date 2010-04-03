package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.IconSupport;
import com.extjs.gxt.ui.client.widget.menu.MenuItem;

import gxt.client.visual.interfaces.presenter.IMenuItemPresenter;
import gxt.client.visual.interfaces.view.IMenuItemView;

/**
 * @author eugenp
 */
public interface IMenuItem extends IItem, IMenuItemView, IMenuItemPresenter, IconSupport{
	
	/** mine */
	MenuItem getComponent();
	
}
