package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.IconSupport;
import com.extjs.gxt.ui.client.widget.menu.MenuItem;

import gxt.visual.ui.client.interfaces.presenter.IMenuItemPresenter;
import gxt.visual.ui.client.interfaces.view.IMenuItemView;

/**
 * @author eugenp
 */
public interface IMenuItem extends IItem, IMenuItemView, IMenuItemPresenter, IconSupport{
	
	/** mine */
	MenuItem getComponent();
	
}
